package Lec3;
import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number to check even or odd");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a%2==0){
            //yes
            System.out.println("a is even");
        }else{
            //no
            System.out.println("a is odd");
        }
    }
}
