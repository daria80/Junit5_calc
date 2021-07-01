package exe2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTestTest extends TestCase {

    @Test
    public void testEncode() {
        PasswordEncoderTest encoder = new PasswordEncoderTest();

        Assert.assertEquals("secret: 'mypwd'", encoder.encode("mypwd"));
    }
}