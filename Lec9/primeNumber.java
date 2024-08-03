package Lec9;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("N is not a prime number");
        }else{
            int count = 0;
            for(int i = 2;i<=n-1;i++){
                if(n%i==0 && n%n==0){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println("N is not a prime number");
            }else{
                System.out.println("N is a prime number");
            }
        }
    }

}

