package Lec11;

public class decToBin {
    public static void main(String[] args) {
        int n = 5;
        int mul = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%2;
            ans = ans + rem * mul;
            mul = mul * 10;
            n = n / 2;
        }
        System.out.println(ans);
    }
}
