package Lec8;
import java.util.*;

public class numberPattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row_val = 1;
        int row = 1;
        while(row<=2*n-1){
            int i = 1;
            while(i<=nst){
                if(i%2==0){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print(row_val+"\t");
                }
                i++;
            }
            if(row<n){
                row_val++;
                nst = nst + 2;
            }else{
                row_val--;
                nst = nst - 2;
            }
            row++;
            System.out.println();
        }
    }
}
