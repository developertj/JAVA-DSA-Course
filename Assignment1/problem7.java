package Assignment1;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row_val = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nst){
                if(i==1||i==nst){
                    System.out.print(row_val+"\t");
                }else{
                    System.out.print("0"+"\t");
                }
                i++;
            }
            System.out.println();
            row++;
            nst++;
            row_val++;
        }
    }
}
