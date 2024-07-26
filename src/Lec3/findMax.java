package Lec3;
import java.util.*;

public class findMax {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to compare and check maximum number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b && a>c){
            System.out.println("a is maximum");
        }else if(b>c){
            System.out.println("b is maximum");
        }else{
            System.out.println("c is maximum");
        }
    }
}
