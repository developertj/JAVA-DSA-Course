package Lec8;
import java.util.*;

public class numberPattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        int row_val = n;
        int row = 1;
        while(row<=n){
            //printing space
            int i = 1;
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }
            //printing numbers
            int j = 1;
            int col_val = row_val; //1


            while(j<=nst){  //1<=9
                if(j==(nst+1)/2){
                    System.out.print("0"+"\t");
                }else{
                    System.out.print(col_val+"\t");
                }

                if(j<(nst+1)/2){
                    col_val++;
                }
                else{
                    col_val--;
                }
                j++;
            }
            if(row<n){//1<10 9<10
                row_val--;//9 //1
                nst=nst+2;//3 //19
            }else{
                row_val++;
                nst=nst-2;
            }
            row++;
            nsp = nsp-1;
            System.out.println();
        }
    }
}

