import java.util.*;
public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
