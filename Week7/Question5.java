import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        try {
            String s1 = "NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c = 'a';
            byte[] b = s1.getBytes();

            byte B = (byte) c;
            b[n] = B;
            System.out.println(new String(b));
            inr.close();
        } catch (Exception e) {
            System.out.println("exception occur");
        }
    }
}