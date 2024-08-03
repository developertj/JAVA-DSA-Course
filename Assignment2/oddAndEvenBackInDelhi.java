package Assignment2;
import java.util.Scanner;

public class oddAndEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); // Number of test cases
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            long sumEven = 0;
            long sumOdd = 0;
            long rem = 0;
            while (n != 0) {
                rem = n % 10;
                if (rem % 2 == 0) {
                    sumEven += rem;
                } else {
                    sumOdd += rem;
                }
                n = n / 10;
            }
            if (sumEven % 4 == 0 || sumOdd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}