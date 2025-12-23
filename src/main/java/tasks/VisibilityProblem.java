
package tasks;

public class VisibilityProblem {
    private int value = 0;

    public synchronized void set(int v) {
        // TODO
        value = v;
    }

    public synchronized int get() {
        System.out.println(value);
        return value;
    }
}
