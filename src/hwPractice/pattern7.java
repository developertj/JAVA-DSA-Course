package hwPractice;
import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int row = 1;
        while(row <= n){
            if(row==2 || row ==3 ||row==n-1){
                int k = 1;
                while(k<=nst){
                    if(k==1 ||k==n){
                        System.out.print("* ");
                        k++;
                    }else if(k==2||k==3||k==4) {
                        System.out.print("  ");
                        k++;
                    }
                }
            }else{
                int i = 1;
                while(i <= nst){
                    System.out.print("* ");
                    i++;
                }
            }
            System.out.println();
            row++;
        }
    }
}
