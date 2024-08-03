package Assignment1;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;
        int row_val = 1;
        int row = 1;
        while(row<=n){
            //printing space
            int i = 1;
            int col_val = row_val;
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }

            //printing nums
            int j = 1;
            while(j<=nst){
                System.out.print(col_val+"\t");
                j++;
                if(j<=(nst+1)/2){
                    col_val++;
                }else{
                    col_val--;
                }
            }

            System.out.println();
            row++;
            nst=nst+2;
            nsp--;
            row_val++;
        }
    }
}
