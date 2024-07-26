package Assignment1;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row = 1;
        int row_val = 0;
        int old_val = 0;
        int new_val = 1;
        while(row<=n){
            int i = 1;
            while (i<=nst){
                System.out.print(row_val+"\t");
                row_val = new_val+old_val;
                new_val = old_val;
                old_val = row_val;
                i++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
