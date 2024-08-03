package Assignment1;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nst){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
