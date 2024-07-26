package Lec8;
import java.util.*;

public class numberPattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int row_val = n;
        int row = 1;
        while(row<=n){
            int i = 1;
            int col_val = row_val;
            while(i<=nst){

                System.out.print(col_val+"\t");
                col_val--;
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
