
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterWithSynchronizedTest {

    @Test
    void incrementsCorrectly() throws Exception {
        CounterWithSynchronized counter = new CounterWithSynchronized();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertEquals(2000, counter.get());
    }
}
