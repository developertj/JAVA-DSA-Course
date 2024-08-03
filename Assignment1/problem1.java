package Assignment1;
import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n+1)/2;
        int nsp = -1;
        int row = 1;
        while(row<=n){
            //printing left star
            int i = 1;
            while(i<=nst){
                System.out.print("*"+"\t");
                i++;
            }
            //printing space
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+"\t");
                j++;
            }
            //printing right star
            int k = 1;
            if(row==1||row==n){
                k=2;
            }
            while(k<=nst){
                System.out.print("*"+"\t");
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
