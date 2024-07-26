package hwPractice;
import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0;
        int nst = n;
        int row = 1;
        while(row <= n){
            int i = 1;
            while(i <= nsp){
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j <= nst){
                System.out.print("*");
                j++;
            }
            System.out.println();
            row++;
            nst--;
            nsp = nsp + 2;
        }
    }
}
