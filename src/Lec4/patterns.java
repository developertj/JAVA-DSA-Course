package Lec4;
import java.util.*;

//public class patterns {
//    public static void main(String[] args) {
//        int n = 1;
//        while (n<=5){//for n == 5
//            System.out.print("* ");
//            n++;
//        }
//    }
//}

//public class patterns {
//    public static void main(String[] args) {
//        int n = 1;
//        while (n<=7){//for n == 7
//            System.out.print("* ");
//            n++;
//        }
//    }
//}

//pattern with n input

//public class patterns {
//    public static void main(String[] args) {1
//        Scanner s = new Scanner(System.in);
//        int count = 1;
//        int n = s.nextInt();
//        while (count <= n){
//            System.out.print("*");
//            count++;
//        }
//    }
//}

//pattern of 2 rows
//public class patterns {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int i = 1;
//        int j = 1;
//        int n = s.nextInt();
//        while (i <= n){
//            System.out.print("*");
//            i++;
//        }
//        System.out.println("");
//        while (j <= n) {
//            System.out.print("*");
//            j++;
//        }
//    }
//}

//other method
//public class patterns {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int row = 1;
//        int n = s.nextInt();
//        while (row <= 2){
//            int i = 1;
//            while(i <= n){
//            System.out.print("*");
//            i++;
//        }
//        System.out.println();
//        row++;
//        }
//    }
//}


//hw question
//for same row same column pattern
public class patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = 1;
        int n = s.nextInt();
        int nst = n; // no. stars
        while (row <= n){
            int i = 1;
            while(i <= nst){
            System.out.print("*");
            i++;
        }
        System.out.println();
        row++;
        }
    }
}

