package Assignment2;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mul = 1;
        long ans = 0;
        while(n!=0){
            long rem = n % 10;
            ans = ans + rem * mul;
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
