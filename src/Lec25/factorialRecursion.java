package Lec25;

public class factorialRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial = fact(n-1);
        return factorial * n;
    }
}
