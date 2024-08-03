package Assignment1;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n-3;
        int row_val = 1;
        int row_num = 1;
        int row = 1;
        while(row<=n){
            //printing nums
            int i = 1;
            int col_val = row_num;
            while(i<=nst) {
                System.out.print(col_val + "\t");
                i++;
                col_val++;
            }
            //printing space
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+"\t");
                j++;
            }
            //printing nums
            int k = 1;
            int col_num = row_val;
            if(row==n){
                k = 2;
                col_num = n - 1;
            }
            while(k<=nst){
                System.out.print(col_num+"\t");
                k++;
                col_num--;
            }
            System.out.println();
            row++;
            nst++;
            nsp=nsp-2;
            row_val++;
        }
    }
}
