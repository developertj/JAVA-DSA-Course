package Assignment2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long rem = 0;
        while(n1%n2!=0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println(n2);
    }
}
