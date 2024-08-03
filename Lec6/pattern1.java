package Lec6;
import java.util.*;

//public class pattern1 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int row = 1;
//        int nst = n;
//        while(row <= n){
//            int i = 1;
//            while(i <= nst){
//                System.out.print("*");
//                i++;
//            }
//            nst--;
//            System.out.println();
//            row++;
//        }
//    }
//}

//other way round
public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int nst = 1;
        while(row <= n){
            int i = 1;
            while(i <= nst){
                System.out.print("*");
                i++;
            }
            nst++;
            System.out.println();
            row++;
        }
    }
}