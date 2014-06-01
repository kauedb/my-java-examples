package kauedb.spring.data.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * User: kauedb
 * Date: 4/2/14
 * Time: 9:08 AM
 */
@ContextConfiguration(classes = Application.class)
public class SalesRulesRepositoryTest extends AbstractTransactionalTestNGSpringContextTests{

    @Autowired
    SalesRulesRepository salesRulesRepository;



}
