package Lec6;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int nst = n;
        int dash = 0;
        while(row <= n){
            int j = 0;
            while(j < dash){
                System.out.print(" ");
                j++;
            }

            int i = 1;
            while(i <= nst){
                System.out.print("*");
                i++;
            }
            dash = dash + 2;
            nst--;
            System.out.println();
            row++;
        }
    }
}

