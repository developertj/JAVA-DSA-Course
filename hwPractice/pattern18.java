package hwPractice;
import java.util.*;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = (n-1)/2;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            int j = 1;
            while(j<=nst){
                System.out.print("*"+" ");
                j++;
            }
            if(row<=(n-1)/2){
                nsp--;
                nst= nst+2;
            }else{
                nsp++;
                nst = nst - 2;
            }
            System.out.println();
            row++;
        }
    }
}
