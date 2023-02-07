import java.util.*;

public class Exercise1_2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            result = x;
        } else if (y > x && y > z) {
            result = y;
        } else {
            result = z;
        }
        System.out.print(result);
        sc.close();
    }
}
