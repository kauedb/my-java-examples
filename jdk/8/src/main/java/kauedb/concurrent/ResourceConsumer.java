package kauedb.concurrent;

/**
 * User: kauedb
 * Date: 4/7/14
 * Time: 6:49 AM
 */
public class ResourceConsumer {


    private final Resource resource = new Resource();

    public int getCount(){

        final int count = resource.getCount();

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return count;
//        synchronized (resource){
//            return resource.getCount();
//        }
    }

}
