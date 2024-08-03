package Lec6;

import java.util.Scanner;

public class hwPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;
        int nst = 1;
        int dash = n - 1;
        while(row <= n){
            int j = 1;
            while(j <= dash){
                System.out.print(" ");
                j++;
            }
            int i = 1;
            while(i <= nst){
                System.out.print("*");
                i++;
            }
            dash--;
            nst = nst + 2;
            System.out.println();
            row++;
        }
    }
}
