
package tasks;

public class CounterWithSynchronized {
    private int value = 0;

    public void increment() {
        // TODO
        synchronized(this){value++;};
    }

    public int get() {
        return value;

    }
}
