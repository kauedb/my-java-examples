package kauedb.spring.data.mongodb;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * User: kauedb
 * Date: 3/30/14
 * Time: 11:44 PM
 */
@Configuration
@ComponentScan
@EnableMongoRepositories
public class Application {

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {
        return new MongoTemplate(mongo(), "test");
    }

    @Bean
    public Mongo mongo() throws UnknownHostException {
        return new Mongo("localhost");
    }

}
