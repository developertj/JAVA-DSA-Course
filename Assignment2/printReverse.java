package Assignment2;

import java.util.Scanner;

public class printReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rev = 0;
        while(n != 0){
            long rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println(rev);
    }
}
