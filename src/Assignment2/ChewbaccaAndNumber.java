package Assignment2;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long checker = 0;
        long mul = 1;
        while(n != 0){
            long rem = 0;
            rem = n % 10;

            if(rem == 9 && n < 10){
                checker = rem;
            }else{
                checker = 9 - rem;
            }
            if(checker < rem ){
                rem = checker;
                ans = ans + rem * mul;
            }else{
                ans = ans + rem * mul;
            }
            mul = mul * 10;
            n = n / 10;
        }
        System.out.println(ans);
    }
}