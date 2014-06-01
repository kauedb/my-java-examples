package kauedb.concurrent;

import java.util.concurrent.Semaphore;

/**
 * User: kauedb
 * Date: 4/7/14
 * Time: 7:59 AM
 */
@ThreadSafe
public class BoundedBuffer<E> {

    private final Semaphore availableItems, availableSpaces;

    @GuardedBy("this") private final E[] items;
    @GuardedBy("this") private int putPosition = 0, takePosition = 0;

    public BoundedBuffer(final int capacity) {
        this.availableItems = new Semaphore(0);
        this.availableSpaces = new Semaphore(capacity);
        this.items = (E[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return availableItems.availablePermits() == 0;
    }

    public boolean isFull(){
        return availableSpaces.availablePermits() == 0;
    }

    public void put(E e) throws InterruptedException {
        availableSpaces.acquire();
        doInsert(e);
        availableItems.release();
    }

    private synchronized void doInsert(E e) {
        int i = putPosition;
        items[i] = e;
        putPosition = (++i == items.length) ? 0 : i;
    }

    public E take() throws InterruptedException {
        availableItems.acquire();
        final E item = doExtract();
        availableSpaces.release();
        return item;
    }

    private synchronized E doExtract() {
        int i = takePosition;
        final E e = items[i];
        takePosition = (++i == items.length) ? 0 : i;
        return e;
    }

}
