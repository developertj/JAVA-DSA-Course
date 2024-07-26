package Assignment1;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = (n-1)/2;
        int row = 1;
        while(row<=n){
            int i = 1;
            //printing space
            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }
            //printing stars
            int j = 1;
            while(j<=nst){
                System.out.print("*"+"\t");
                j++;
            }
            if(row<(n+1)/2){
                nst = nst + 2;
                nsp--;
            }else{
                nst = nst - 2;
                nsp++;
            }
            row++;
            System.out.println();
        }
    }
}
