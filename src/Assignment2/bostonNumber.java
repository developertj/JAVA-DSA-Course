package Assignment2;

import java.util.Scanner;

public class bostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isBostonNumber(number));
    }
    public static int isBostonNumber(int n){
        int digit = sumOfDigits(n);
        int div = 2;
        int sumPrime = 0;
        while(div <= n ){
            int rem = n % div;
            if(rem == 0){
                sumPrime= sumPrime + sumOfDigits(div);
                n /= div;
            }else{
                div++;
            }
        }
        if(sumPrime == digit){
            return 1;
        } else{
            return 0;
        }
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
