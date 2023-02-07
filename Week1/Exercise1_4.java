import java.util.*;

public class Exercise1_4 {
    public static void main(String[] args) {
        int n;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.print(result);
        sc.close();
    }
}
