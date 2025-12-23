
package tasks;

public class CounterWithoutRace {
    private int value = 0;

    public synchronized void increment() {
        // TODO
        value++;
    }

    public synchronized int get() {
        return value;
    }
}
