package Lec11;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 2346;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.print(rev);

    }
}
