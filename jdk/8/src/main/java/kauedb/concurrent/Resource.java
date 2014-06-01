package kauedb.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: kauedb
 * Date: 4/6/14
 * Time: 11:25 AM
 */
public class Resource {

    private final ReentrantLock reentrantLock = new ReentrantLock(true);
    private int count = 1;

    public int getCount() {
        return count++;
    }

    public int getThreadSafeCount() throws Throwable {
//        reentrantLock.lock();
        boolean isLocked = reentrantLock.tryLock(0, TimeUnit.NANOSECONDS);
//        reentrantLock.lockInterruptibly();
        try {
            return count++;
        } finally {
            if(isLocked)
            reentrantLock.unlock();
        }
    }

    public synchronized int getSynchronizedCount() {
        return count++;
    }

}
