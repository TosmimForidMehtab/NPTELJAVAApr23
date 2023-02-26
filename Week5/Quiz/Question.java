public class Question {
    public static void main(String args[]) {
        try {
            int a, b;
            b = 0;
            a = 25 / b;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }
}
