package hwPractice;
import java.util.*;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = (n-1)/2;
        int msp = -1;
        int row = 1;
        while(row<=n){
            //leftside space
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            //middle star
            int j = 1;
            while(j<=nst){
                System.out.print("*"+" ");
                j++;
            }

            //middle space
            int k = 1;
            while(k<=msp){
                System.out.print(" "+" ");
                k++;
            }

            //rightstar
            int l = 1;
            if(row==1||row==n){
                l=2;
            }
            while(l<=nst){
                System.out.print("*"+" ");
                l++;
            }
            if(row<(n+1)/2){
                nsp--;
                msp = msp + 2;
            }else{
                nsp++;
                msp = msp - 2;
            }
            System.out.println();
            row++;
        }
    }
}
