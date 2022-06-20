import model.DateToken;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Token {

    public String buildToken(DateToken dateToken) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(dateToken.getTransactionId() + "_" + dateToken.getApplicationCode() + "_" + dateToken.getUserId() + "_" + dateToken.getApplicationKey()));
            return String.format("%032x", new BigInteger(1, md5.digest()));
        } catch (Exception e) {
            System.out.println("Error al crear Token; " + e);
        }
        throw new RuntimeException("Ocurrio un error");
    }
}
