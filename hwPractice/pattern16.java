package hwPractice;
import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = n;
        int row = 1;
        while(row<=2*n-1){
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+" "+" ");
                i++;
            }
            int j = 1;
            while(j<=nst){
                System.out.print("*"+" "+" ");
                j++;
            }
            if(row<n){
                nst--;
                nsp--;
            }else{
                nsp++;
                nst++;
            }
            System.out.println();
            row++;
        }
    }
}
