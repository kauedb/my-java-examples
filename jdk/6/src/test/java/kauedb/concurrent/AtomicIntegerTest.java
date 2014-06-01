package kauedb.concurrent;

import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 4/10/14
 * Time: 9:46 AM
 */
public class AtomicIntegerTest {

    @Test
    public void GET_AND_ADD_THEN_GET(){
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndAdd(1);

        assertEquals(atomicInteger.get(), 1);
    }

    @Test
    public void ADD_AND_GET_THEN_GET(){
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.addAndGet(1);

        assertEquals(atomicInteger.get(), 1);
    }

    @Test
    public void GET_AND_ADD(){
        AtomicInteger atomicInteger = new AtomicInteger();

        assertEquals(atomicInteger.getAndAdd(1), 0);
    }

    @Test
    public void ADD_AND_GET(){
        AtomicInteger atomicInteger = new AtomicInteger();

        assertEquals(atomicInteger.addAndGet(1), 1);
    }

}
