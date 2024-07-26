package Assignment1;
import java.util.*;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = -1;
        int row = 1;
        while(row<=2*n-1){
            //left stars
            int i = 1;
            while(i<=nst){
                System.out.print("*");
                i++;
            }
            //gap
            int j = 1;
            while(j<=nsp){
                System.out.print(" ");
                j++;
            }
            //right stars
            int k = 1;
            if(row==1||row==2*n-1){
                k=2;
            }
            while(k<=nst){
                System.out.print("*");
                k++;
            }
            if(row<n){
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
