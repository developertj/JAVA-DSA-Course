package Lec6;
import java.util.*;

public class hwPattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int row = 1;
        int dash = n - 1;
        while (row <= n){
            int j = 1;
            while (j <= dash){
                System.out.print(" ");
                j++;
            }
            int i = 1;
            while(i <= nst){
                System.out.print("*");
                i++;
            }
            System.out.println();
            dash--;
            nst = nst + 2;
            row++;
        }
    }
}
