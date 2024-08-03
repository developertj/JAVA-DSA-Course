package Assignment2;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long digit = sc.nextLong();
        long count = 0;
        while(n!=0){
            long rem = n % 10;
            if(rem == digit){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
