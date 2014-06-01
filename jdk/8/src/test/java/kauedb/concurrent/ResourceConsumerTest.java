package kauedb.concurrent;

import org.testng.annotations.Test;

/**
 * User: kauedb
 * Date: 4/7/14
 * Time: 6:50 AM
 */
public class ResourceConsumerTest {

    ResourceConsumer resourceConsumer = new ResourceConsumer();

    @Test
    public void test() throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final int count = resourceConsumer.getCount();
                System.out.printf("count=%d%n",count);
            }
        };

        for (int i = 0; i < 15; i++) {
            final Thread thread = new Thread(runnable);
            thread.start();
        }

        Thread.sleep(3000L);

    }

}
