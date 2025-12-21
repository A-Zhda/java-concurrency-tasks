
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisibilityProblemTest {

    @Test
    void valueIsVisible() throws Exception {
        VisibilityProblem vp = new VisibilityProblem();

        Thread t = new Thread(() -> vp.set(42));
        t.start();
        t.join();

        assertEquals(42, vp.get());
    }
}
