package hwPractice;
import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int nst = n;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=nst){
                System.out.print('*');
                i++;
            }
            System.out.println();
            row++;
            nst--;
        }
    }
}
