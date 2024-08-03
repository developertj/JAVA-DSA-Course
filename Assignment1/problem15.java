package Assignment1;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n + 1;
        int nsp = 0;
        int row_val = n;
        int row = 1;
        while(row<=2*n+1){
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            //left star
            int j = 1;
            int col_val = row_val;
            while(j<=nst){
                System.out.print(col_val+" ");
                j++;
                col_val--;
            }
            //printing right star
            int k = 1;
            col_val = 0;
            if(row==n+1&&k==1){
                k = 2;
            }
            while(k<=nst-1){
                col_val++;
                System.out.print(col_val+" ");
                k++;
            }
            System.out.println();
            row++;
            if(row<=n+1){
                row_val--;
                nsp++;
                nst--;
            }else{
                row_val++;
                nsp--;
                nst++;
            }
        }
    }
}
