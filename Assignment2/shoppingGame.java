package Assignment2;

import java.util.Scanner;

public class shoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for(int i = 1;i <= t;i++){
            double m = sc.nextDouble();
            double n = sc.nextDouble();
            long sumEven = 2;
            long sumOdd = 1;
            while(m>sumOdd){
                sumOdd = sumOdd + 2;
            }
            while(n>sumEven){
                sumEven = sumEven + 2;
            }
            if(sumEven>sumOdd){
                System.out.println("Harshit");
            }else{
                System.out.println("Aayush");
            }
        }
    }
}
