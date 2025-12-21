
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterWithoutRaceTest {

    @Test
    void noRaceCondition() throws Exception {
        CounterWithoutRace counter = new CounterWithoutRace();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) counter.increment();
            });
            threads[i].start();
        }

        for (Thread t : threads) t.join();

        assertEquals(10000, counter.get());
    }
}
