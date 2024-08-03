package Assignment1;

import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n-1;
        int row = 1;
        while(row<=2*n+1){
            //printing left numbers
            int i = 1;
            int row_val = n;
            while(i<=nst){
                System.out.print(row_val+" ");
                i++;
                row_val--;
            }

            //printing mid space
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
            //printing right number
            int k = 1;

            while(k<=nst){

                row_val++;
                if(row==n+1&&k==1){
                    k=2;
                    row_val=1;
                }
                System.out.print(row_val+" ");
                k++;
            }
            System.out.println();
            row++;
            if(row<=n+1){
                nst++;
                nsp = nsp-2;
            }else{
                nst--;
                nsp = nsp+2;
            }
        }
    }
}
