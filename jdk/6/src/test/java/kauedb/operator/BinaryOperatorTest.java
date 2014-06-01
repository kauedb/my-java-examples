package kauedb.operator;

import org.testng.annotations.Test;

/**
 * User: kauedb
 * Date: 4/14/14
 * Time: 9:38 AM
 */
public class BinaryOperatorTest {


    @Test
    public void test() throws InterruptedException {
        byte i = 1; // 0000_0001 = 1
        byte x = (byte) (i << 1); // 0000_0010 = 2
        System.out.printf("x=%d,i=%d%n", x, i);
        x = (byte) (i << 2); // 0000_0100 = 4
        System.out.printf("x=%d,i=%d%n", x, i);
        x = (byte) (i << 3); // 0000_1000 = 8
        System.out.printf("x=%d,i=%d%n", x, i);
        x = (byte) (i << 3); // 0000_1000 = 8
        System.out.printf("x=%d,i=%d%n", x, i);

        Thread.sleep(3000L);
    }

}
