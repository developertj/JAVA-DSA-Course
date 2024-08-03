package Assignment1;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int row_val = 1;
        int row = 1;
        while(row<=2*n-1){
            //printing space
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }
            //printing nums
            int j = 1;
            int col_val = row_val;
            while(j<=nst){
                System.out.print(col_val+"\t");
                j++;
                if(j<=(nst+1)/2){
                    col_val++;
                }else{
                    col_val--;
                }
            }
            System.out.println();
            if(row<n){
                nst = nst + 2;
                nsp--;
                row_val++;
            }else{
                nst = nst - 2;
                nsp++;
                row_val--;
            }
            row++;
        }
    }
}
