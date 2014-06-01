package kauedb;

import org.testng.annotations.Test;

/**
 * User: kauedb
 * Date: 5/1/14
 * Time: 10:03 AM
 */
public class WavedTest {

    Waved waved = new Waved();

    @Test
    public void hello() throws Exception {

        waved.hello();

        Thread.sleep(3000L);
    }

}
