
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VolatileFlagTest {

    @Test
    void threadStops() throws Exception {
        VolatileFlag flag = new VolatileFlag();

        Thread t = new Thread(flag::runLoop);
        t.start();

        Thread.sleep(50);
        flag.stop();

        t.join(500);
        assertFalse(t.isAlive());
    }
}
