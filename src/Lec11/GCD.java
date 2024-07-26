package Lec11;

public class GCD {
    public static void main(String[] args) {
        int divisor = 36;
        int dividend = 60;

        int i = 1;
        while(dividend % divisor != 0){
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.print("The gcd is ");
        System.out.println(divisor);
    }
}
