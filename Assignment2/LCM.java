package Assignment2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        System.out.println(lcm(n1,n2));
    }
    public static long lcm(long n1,long n2){
        return (n1*n2)/gcd(n1,n2);
    }
    public static long gcd(long n1, long n2){
        while(n2!=0){
            long temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
