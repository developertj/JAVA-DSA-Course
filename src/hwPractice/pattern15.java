package hwPractice;
import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = 0;
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
