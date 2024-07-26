package Assignment1;

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row_val = 1;
        int row = 1;
        int mid = -1;
        while(row<=n){
            //printing left spaces
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            //printing left numbers
            int j = 1;
            int col_val = row_val;
            while(j<=nst){

                System.out.print(col_val+" ");
                j++;
                col_val--;
            }

            //printing mid space
            int k = 1;
            while(k<=mid){
                System.out.print(" "+" ");
                k++;
            }

            //printing right numbers
            int l = 1;
            if(row==1||row==n){
                l = 2;
            }
            int right_col_val = 1;
            while(l<=nst){

                System.out.print(right_col_val+" ");
                l++;
                right_col_val++;
            }
            System.out.println();
            row++;
            if(row<=(n+1)/2){
                nst++;
                nsp = nsp - 2;
                row_val++;
                mid = mid + 2;
            }else{
                nst--;
                nsp = nsp + 2;
                row_val--;
                mid = mid -2;
            }

        }
    }
}
