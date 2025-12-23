
package tasks;

import java.util.List;

public class SynchronizedBlockOrdering {
    private final Object lock = new Object();

    public synchronized void add(List<Integer> list, int value) {
        // TODO

        list.add(value);

        System.out.println(value + ", размер " + list.size());
    }
}
