package hwPractice;
import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;
        while(row <= n){
            int i = 1;
            while(i <= n){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
