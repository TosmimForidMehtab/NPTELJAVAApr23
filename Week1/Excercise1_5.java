import java.util.Scanner;

public class Excercise1_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double mark_avg = 0.0;
        int result;
        int i;
        int s;
        s = inp.nextInt();
        int[] arr = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        int currMax = arr[0];
        for (int j = 0; j < arr.length; j++) {
            mark_avg += arr[j];
            currMax = Math.max(arr[j], currMax);
        }
        result = currMax;
        mark_avg /= s;
        System.out.println(result);
        System.out.println(mark_avg);

        inp.close();
    }
}
