package Assignment3;

import java.util.Scanner;

public class pairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n =  0;
        int m = 0;
        int []price = new int[0];
        for(int i = 0; i < t;i++){
             n = sc.nextInt();
             price = new int[n];
            for (int j = 0; j < n; j++) {
                price[j] = sc.nextInt();
            }
            m = sc.nextInt();
            roses(price,m);
        }
    }
    public static void roses(int []price, int m){
        int n1 = 0;
        int n2 = 0;
        int difference = 0;
        int n = price.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n-i; j++) {
                sum = price[i] + price[j];
                difference = price[i] - price[j];
                if(sum == m){
                    n1 = price[i];
                    n2 = price[j];
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + n2 +" and " + n1);
    }
}
