package hwPractice;
import java.util.*;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n+1)/2;
        int nsp = -1;
        int row = 1;
        while(row<=n){
            //printing left side
            int i = 1;
            while(i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            int j = 1;
            while(j<=nsp) {
                System.out.print(" "+" ");
                j++;
            }
            //rightside
            int k = 1;
            if(row==1 || row==n){
                k = 2;
            }
            while(k<=nst){
                System.out.print("*"+" ");
                k++;
            }
            if (row <(n+1)/2) {
                nst--;
                nsp = nsp + 2;
            }else{
                nst++;
                nsp = nsp - 2;
            }
            System.out.println();
            row++;
        }
    }
}
