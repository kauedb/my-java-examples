package kauedb.concurrent;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * User: kauedb
 * Date: 4/8/14
 * Time: 8:56 AM
 */
public class BoundedBufferTest {

    public static final long LOOKUP_DETECTED_TIMEOUT = 1000L;

    @Test
    public void IS_EMPTY_WHEN_CONSTRUCT() {
        final BoundedBuffer<Integer> integerBoundedBuffer = new BoundedBuffer<Integer>(10);
        assertTrue(integerBoundedBuffer.isEmpty());
        assertFalse(integerBoundedBuffer.isFull());
    }

    @Test
    public void IS_FULL_AFTER_PUTS() throws InterruptedException {
        final BoundedBuffer<Integer> integerBoundedBuffer = new BoundedBuffer<Integer>(10);
        for (int i = 0; i < 10; i++) {
            integerBoundedBuffer.put(i);
        }
        assertTrue(integerBoundedBuffer.isFull());
        assertFalse(integerBoundedBuffer.isEmpty());
    }

    // Testing Blocking and Responsiveness
    @Test
    public void TAKE_BLOCK_WHEN_EMPTY() {
        final BoundedBuffer<Integer> integerBoundedBuffer = new BoundedBuffer<Integer>(10);
        final Thread taker = new Thread() {
            @Override
            public void run() {
                try {
                    int unused = integerBoundedBuffer.take();
                    fail();
                } catch (InterruptedException e) {

                }
            }
        };

        try {
            taker.start();
            Thread.sleep(LOOKUP_DETECTED_TIMEOUT);
            taker.interrupt();
            taker.join(LOOKUP_DETECTED_TIMEOUT);
            assertFalse(taker.isAlive());
        } catch (Exception e) {
            fail();
        }

    }


    static int xorShift(int y){
        y ^= (y << 6);
        y ^= (y >>> 21);
        y ^= (y << 7);
        return y;
    }

    @Test
    public void test() throws InterruptedException {
        int i = xorShift(1);
        System.out.println(i);
        Thread.sleep(3000L);
    }

}
