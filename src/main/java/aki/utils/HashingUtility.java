package aki.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Base64;

public class HashingUtility {
    public static String computeSignature(String baseString) throws GeneralSecurityException {
        var mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(new BigInteger("715ffccf8c0536f186bf127a16c14682827fc581", 16).toByteArray(), "HmacSHA1"));
        var a = mac.doFinal(baseString.getBytes(StandardCharsets.UTF_8));
        var b = new byte[a.length + 1];
        System.arraycopy(a, 0, b, 1, a.length);
        b[0] = 1;
        return new String(Base64.getEncoder().encode(b), StandardCharsets.UTF_8);
    }
}