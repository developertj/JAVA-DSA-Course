package Assignment2;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev1 = 1;
        int prev2 = 1;
        int fib = 0;
        for(int i = 0; i < n; i++){
            if(i==0){
                fib = 0;
            }else if(i == 1){
                fib = 1;
            }else{
                fib = prev1 + prev2;
                prev2 = prev1;
                prev1 = fib;
            }
        }
        System.out.println(fib);
    }
}
