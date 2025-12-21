
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeadlockExampleTest {

    @Test
    void noDeadlock() throws Exception {
        DeadlockExample ex = new DeadlockExample();

        Thread t1 = new Thread(ex::methodA);
        Thread t2 = new Thread(ex::methodB);

        t1.start();
        t2.start();

        t1.join(500);
        t2.join(500);

        assertFalse(t1.isAlive());
        assertFalse(t2.isAlive());
    }
}
