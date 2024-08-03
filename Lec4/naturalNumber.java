package Lec4;
import java.util.*;

public class naturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of natural numbers to be printed");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while(count <= n){
            System.out.println(count);
            count++;
        }
    }
}
