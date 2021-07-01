package exe2;

import jdk.swing.interop.DragSourceContextWrapper;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest implements PasswordEncoder {


    @Override
    public String encode(CharSequence rawPassword) {
        return String.format("secret: '%s'", rawPassword);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return false;
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return PasswordEncoder.super.upgradeEncoding(encodedPassword);
    }
}
