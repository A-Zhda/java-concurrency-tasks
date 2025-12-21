
package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SafePublicationTest {

    @Test
    void holderIsFullyConstructed() {
        SafePublication sp = new SafePublication();
        sp.init();

        SafePublication.Holder h = sp.getHolder();
        assertNotNull(h);
        assertEquals(1, h.a);
        assertEquals(2, h.b);
    }
}
