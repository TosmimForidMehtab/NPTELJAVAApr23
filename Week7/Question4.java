import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        int c = 0;
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String s1 = br.readLine();
            // Write your code here to count the number of vowels in the string "s1"
            for (int i = 0; i < s1.length(); i++) {
                char str = s1.charAt(i);
                if (str == 'e' || str == 'E' || str == 'a' || str == 'A' || str == 'i' || str == 'I' || str == 'o'
                        || str == 'O' || str == 'u' || str == 'U') {
                    c++;
                }
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}