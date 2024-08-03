package hwPractice;
import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;
        int row = 1;
        while(row<=n){
            int j = 1;
            while(j <= nsp){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while(i<=nst){ //1<=5
                if(i%2==0){  //x
                    System.out.print(" "+" ");
                }else{ //ex
                    System.out.print("*"+" ");
                }
                i++;
            }
            System.out.println();
            row++;
            nst = nst+2;
            nsp--;
        }
        }
}

