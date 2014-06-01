package kauedb.concurrent;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

/**
 * User: kauedb
 * Date: 4/6/14
 * Time: 11:24 AM
 */
public class ResourceLockTest {

    Resource resource = new Resource();

    @Test(threadPoolSize = 15)
    public void THREAD_UNSAFE() throws InterruptedException {

        final CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final int count = resource.getCount();
                list.add(count);
                System.out.printf("count=%d%n", count);
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        for (int i = 0; i < 1000; i++) {
            final Thread thread = new Thread(runnable);
            thread.start();
        }



        final Set<Integer> set = new HashSet<Integer>(list);

        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1000);
        assertEquals(list.size(), set.size());

    }

    @Test
    public void THREAD_SYNCHRONIZED() throws InterruptedException {
        final CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    final int count = resource.getThreadSafeCount();
                    list.add(count);
                    System.out.printf("count=%d%n", count);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 1000; i++) {
            final Thread thread = new Thread(runnable);
            thread.start();
        }

        Thread.sleep(3000L);

        final Set<Integer> set = new HashSet<Integer>(list);

        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1000);
        assertEquals(list.size(), set.size());

    }

    @Test
    public void THREAD_REENTRANT_LOCK() throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        final int count = resource.getThreadSafeCount();
                        System.out.printf("count=%d%n", count);
                        Thread.sleep(count * 1000L);
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            };

            final Thread thread = new Thread(run);
            thread.start();

//            if(i == 1){
//                thread.interrupt();
//            }
        }

        Thread.sleep(2000L);
    }


}
