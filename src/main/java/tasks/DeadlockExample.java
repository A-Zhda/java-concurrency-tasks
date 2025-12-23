
package tasks;

public class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void methodA() {
        // TODO
        synchronized (lockA) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error" + e);
            }

            synchronized (lockB){
                System.out.println("Завершено");
            }
        }
    }

    public synchronized void methodB() {
        // TODO
        synchronized (lockA) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error" + e);
            }

            synchronized (lockB) {
                System.out.println("Завершено2");
            }
        }
    }
}
