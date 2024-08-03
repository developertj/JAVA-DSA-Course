package Assignment2;

import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(printInverse(number));
    }
    public static int printInverse(int number) {
        int ans = 0;
        int length = (int) Math.log10(number)+1;
        for (int i = 1; i <= length; i++){
            int rem = number % 10;
            ans = ans + i * (int) Math.pow(10,rem-1);
            number /= 10;
        }
        return ans;
    }
}
