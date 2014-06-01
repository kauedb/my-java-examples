package kauedb.spring.data.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.testng.Assert.*;

/**
 * User: kauedb
 * Date: 3/30/14
 * Time: 11:49 PM
 */
@ContextConfiguration(classes = Application.class)
public class MongoDbTest extends AbstractTestNGSpringContextTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void createJohnSnow(){
        final User entity = new User();
        entity.setId(1L);
        entity.setName("John Snow");
        entity.setAge(17);
        entity.setWeapons(Arrays.asList("sword"));
        entity.setRegion("north");
        userRepository.save(entity);

        final User persisted = userRepository.findOne(1L);
        assertEquals(persisted, entity);
    }

    @Test
    public void createAria(){
        final User entity = new User();
        entity.setId(2L);
        entity.setName("Aria");
        entity.setAge(12);
        entity.setWeapons(Arrays.asList("sword"));
        entity.setRegion("north");
        userRepository.save(entity);

        final User persisted = userRepository.findOne(2L);
        assertEquals(persisted, entity);
    }

    @Test(dependsOnMethods = "createJohnSnow")
    public void findUsers() {
        final List<User> result = userRepository.findAll();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test(dependsOnMethods = {"createJohnSnow", "createAria"})
    public void findUserByName() {
        final String name = "John Snow";
        final Collection<User> result = userRepository.findByName(name);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(result.iterator().next().getName(), name);
    }

}
