package hwPractice;
import java.util.*;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row = 1;
        while(row<=2*n-1){
            int i = 1;
            while(i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            if(row<n){
                nst++;
            }else{
                nst--;
            }
            System.out.println();
            row++;
        }
    }
}
