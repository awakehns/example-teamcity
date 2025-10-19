package plaindoll;

import org.junit.Test;
import static org.junit.Assert.*;

public class WelcomerTest {

    @Test
    public void testGetGreeting() {
        Welcomer welcomer = new Welcomer();
        assertEquals("Hello Player!", welcomer.getGreeting());
    }

    @Test
    public void testGetHunterReply() {
        Welcomer welcomer = new Welcomer();
        String reply = welcomer.getHunterReply();
        assertTrue(reply.contains("hunter"));
    }
}

