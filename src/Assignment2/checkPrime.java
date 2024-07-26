package Assignment2;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 1){
            System.out.println("Not Prime");
        }else{
            int count = 0;
            for(int i = 2;i<=n-1;i++){
                if(n%i==0 && n%n==0){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
}
