package exe2;

import junit.framework.TestCase;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTestTest extends TestCase {

    @Test
    public void testEncode() {
        PasswordEncoderTest encoder = new PasswordEncoderTest();

        Assert.assertEquals("secret: 'mypwd'", encoder.encode("mypwd"));
        Assert.assertThat(encoder.encode("mypwd"), Matchers.containsString("mypwd"));
    }
}