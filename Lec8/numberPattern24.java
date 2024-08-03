package Lec8;
import java.util.*;

public class numberPattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int nsp = n-1;
        int row = 1;
        while(row<=n){
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+" ");
                j++;
            }
            int i = 1;
            while(i<=num){
                System.out.print(row+" ");
                i++;
            }
            num = num + 2;
            nsp--;
            row++;
            System.out.println();
        }
    }
}
