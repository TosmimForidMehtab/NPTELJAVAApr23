import java.util.*;;
public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 0.0;
        double area = 0.0;

        if (radius <= 0) {
            System.out.println("EWWWW....");
        }
        else {
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;
            System.out.println(perimeter);
            System.out.println(area);
        }

        sc.close();
    }
}
