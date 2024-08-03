package hwPractice;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nsp){
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j<=nst){
                System.out.print("*");
                j++;
            }
            System.out.println();
            row++;
            nsp--;
            nst++;
        }
    }
}
