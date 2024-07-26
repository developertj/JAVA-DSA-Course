package Assignment1;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int nst = n;
        int nsp = n - 1;
        int row = 1;
        int mid = n - 2;
        while(row<=n){
            int i = 1;
            while(i<=nsp){
                System.out.print(" ");
                i++;
            }
            if(row==1||row==n){
                int j = 1;
                while(j<=nst){
                    System.out.print("*");
                    j++;
                }
            }else{
                int k = 1;
                while(k<=nst){
                    if(k==1||k==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    k++;
                }
            }
            System.out.println();
            row++;
            nsp--;

        }
    }
}
