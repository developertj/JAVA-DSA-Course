package hwPractice;
import java.util.*;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = 1;
        int row = 1;
        while(row<=n){
            //printing left side
            int i = 1;
            while (i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            //printing space
            int j = 3;
            while(j<=nsp && row>1){
                System.out.print(" "+" ");
                j++;
            }

            //printing right side
            int k = 1;
            if(row==1){
                k = 2;
            }
            while(k<=nst){
                System.out.print("*"+" ");
                k++;
            }
            System.out.println();
            nst--;
            row++;
            nsp = nsp+2;
        }
    }
}
