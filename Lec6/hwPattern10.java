package Lec6;
import java.util.*;

public class hwPattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 2*n-1;
        int row = 1;
        int dash = 0;
        while(row <= n){
            int i = 1;
            while(i <= dash){
                System.out.print(" "+" ");
                i++;
            }
            int j = 1;
            while(j <= nst) {
                System.out.print("*"+" ");
                j++;

            }
            System.out.println();
            row++;
            nst = nst - 2;
            dash++;

        }
    }
}
