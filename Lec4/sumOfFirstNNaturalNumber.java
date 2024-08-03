package Lec4;
import java.util.*;

public class sumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of natural numbers to sum be printed");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i;
            i++;
        }
            System.out.println(sum);
    }
}
