package hwPractice;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = 0; //2
        int row = 1;
        while(row <= n){ //1<=5
            int i = 1;
            while(i <= nsp){  //1 <= 0 1<=2 2<=2
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j<=nst){ //1<=5 , 2<=5, 3<=5, 4<=5, 5<=5,
                System.out.print('*');
                j++;
            }
            System.out.println();
            row++;
            nsp = nsp + 2;
            nst--;
        }
    }
}

