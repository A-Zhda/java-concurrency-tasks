
package tasks;

public class SafePublication {
    private Holder holder;

    public void init() {
        // TODO
    }

    public Holder getHolder() {
        return holder;
    }

    public static class Holder {
        public final int a;
        public final int b;

        public Holder(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
