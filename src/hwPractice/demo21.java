package hwPractice;
import java.util.*;

public class demo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n-3;
        int row = 1;
        while(row<=n){
            //printing left side
            int i = 1;
            while (i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            //printing space
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
            //printing right side
            int k = 1;
            if(row==n){
                k=2;
            }
            while(k<=nst){
                System.out.print("*"+" ");
                k++;
            }
            System.out.println();
            row++;
            nst++;
            nsp = nsp-2;
        }
    }
}
