package kauedb.spring.data.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

/**
 * User: kauedb
 * Date: 3/30/14
 * Time: 11:54 PM
 */
public interface UserRepository extends MongoRepository<User, Long> {

    public Collection<User> findByName(String name);

}
