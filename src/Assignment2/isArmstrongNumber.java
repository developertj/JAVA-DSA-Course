package Assignment2;

import java.util.Scanner;

public class isArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((isArmstrong(number)));
    }
    public static boolean isArmstrong(int number){
        int ogNum = number;
        int length = (int) (Math.log10(number)+1);
        int sum = 0;
        while(number!=0){
            int rem = number % 10;
            sum += (int) Math.pow(rem,length);
            number /= 10;
        }
        if(sum==ogNum){
            return true;
        }
        return false;
    }
}
