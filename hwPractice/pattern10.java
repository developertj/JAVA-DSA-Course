package hwPractice;
import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 2*n-1;
        int nsp = 0;
        int row = 1;
        while(row<=n){
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
            nsp++;
            nst = nst - 2;
        }
    }
}
