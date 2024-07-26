package Lec11;

public class binToDec {
    public static void main(String[] args) {
        int n = 101;
        int mul = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            ans = ans + rem * mul; //1 //0 // //5
            mul = mul * 2;
            n = n/10;
        }
        System.out.println(ans);
    }
}
