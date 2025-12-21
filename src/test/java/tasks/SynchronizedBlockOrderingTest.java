
package tasks;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class SynchronizedBlockOrderingTest {

    @Test
    void listIsConsistent() throws Exception {
        SynchronizedBlockOrdering sbo = new SynchronizedBlockOrdering();
        List<Integer> list = new ArrayList<>();

        Thread t1 = new Thread(() -> sbo.add(list, 1));
        Thread t2 = new Thread(() -> sbo.add(list, 2));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertEquals(2, list.size());
    }
}
