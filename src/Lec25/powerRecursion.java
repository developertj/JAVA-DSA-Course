package Lec25;

public class powerRecursion {
    public static void main(String[] args) {
        int num = 5;
        int power = 4;
        System.out.println(pow(num,power));
    }
    public static int pow(int num, int power){
        if(power==0){
            return 1;
        }
        int ans = pow(num, power-1);
        return ans*num;
    }
}
