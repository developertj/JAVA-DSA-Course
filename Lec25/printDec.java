package Lec25;

public class printDec {
    public static void main(String[] args) {
        int n = 5;
         printDecimal(n);
    }
    public static void printDecimal(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecimal(n-1);
    }
}
