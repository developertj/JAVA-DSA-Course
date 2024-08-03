package Lec8;
import java.util.*;

public class numberPattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int nsp = n-1;
        int row = 1;
        int row_val = 1;
        while(row<=n){
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+"\t");
                j++;
            }
            int col_val = row_val;
            int i = 1;
            while(i<=num){
                System.out.print(col_val+"\t");
                i++;
                col_val++;
            }
            num = num + 2;
            nsp--;
            row++;
            System.out.println();
        }
    }
}