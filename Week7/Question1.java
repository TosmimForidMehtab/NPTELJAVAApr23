import java.util.Scanner;

// Write the appropriate statement(s) to import the package(s) you need in your program

public class Question1 {
    public static void main(String[] args) {

        // Write the appropriate code to read the 3 integer values and find their sum.
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum = a + b + c;
        System.out.println(sum);
        sc.close();
    }
}