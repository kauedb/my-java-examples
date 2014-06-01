package kauedb.logging;

import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User: kauedb
 * Date: 4/22/14
 * Time: 8:33 AM
 */
public class LoggerTest {

    Logger logger = Logger.getLogger("LoggerTest");

    @Test
    public void HELLO_WORLD(){
        logger.log(Level.INFO, "Hello World");
        logger.log(Level.WARNING, "Hello World");
        logger.log(Level.OFF, "Hello World");

        logger.log(Level.CONFIG, "Hello World");
        logger.log(Level.FINE, "Hello World");
        logger.log(Level.FINER, "Hello World");
        logger.log(Level.FINEST, "Hello World");
        logger.log(Level.ALL, "Hello World");
    }

}
