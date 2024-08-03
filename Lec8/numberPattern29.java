package Lec8;
import java.util.*;

public class numberPattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int nsp = n-1;
        int row = 1;
        int row_val = 1;
        while(row<=n){
            int j = 1;
            while(j<=nsp){
                System.out.print(" "+"\t");
                j++;
            }
            int col_val = row_val;
            int i = 1;
            while(i<=num){

                if(i==1||i==num){
                    System.out.print(col_val+"\t");
                }else{
                    System.out.print('0'+"\t");
                }
                i++;
            }
            row_val++;
            num = num + 2;
            nsp--;
            row++;
            System.out.println();
        }
    }
}
