package Assignment1;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row_val = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            int col_val = row_val;
            while(i<=nst){
                System.out.print(row_val+"\t");
                i++;
                row_val++;
            }
            System.out.println();
//            row_val++;
            row++;
            nst++;
        }
    }
}
