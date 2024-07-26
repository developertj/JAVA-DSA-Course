package Assignment2;

import java.util.Scanner;

public class sumOfOddPlacedAndEvenPlacedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sumEven = 0;
        long sumOdd = 0;
        long position = 1;
        while(n!=0){
            long rem = n % 10;
            if(position%2==0){
                sumEven += rem;
            }else{
                sumOdd += rem;
            }
            n /= 10;
            position++;
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
