package Lec8;
import java.util.*;

public class numberPattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;//3
        int nsp = n - 1;
        int row_val = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }
            int j = 1;
            int col_val = row_val;             //1 //1 //2
            while(j<=nst){//1<=1 true//1<=3 true 2<=3
                System.out.print(col_val+"\t");//1//1 //2
                if(j<(nst+1)/2){//2<=1 false 2<=2
                    col_val++;      //2
                }else{
                    col_val--; //col_val = 0
                }
                j++;//j==2 2
            }

            System.out.println();
            nsp--;
            nst = nst + 2;
            row++;
        }
    }
}
