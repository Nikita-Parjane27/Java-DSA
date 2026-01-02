import java.util.Random;

public class OTP_Generator {
    public static void main(String[] args) {
        Random random= new Random();
         int otp = 100000 + random.nextInt(900000);
        // int otp=(int)(Math.random()*900000)+100000;
         System.out.println("OTP IS : " + otp);
    }
}
