package hwPractice;
import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n-1)/2;
        int nsp = 1;
        int row = 1;
        while(row<=n){
            //printing left stars
            int i = 1;
            while(i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            //printing the space
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
            //printing right stars
            int k = 1;
            while(k<=nst){
                System.out.print("*"+" ");
                k++;
            }

            if(row<(n+1)/2){
                nst--;
                nsp=nsp+2;
            }else{
                nst++;
                nsp=nsp-2;
            }
            System.out.println();
            row++;
        }
    }
}
