package Assignment2;

import java.util.Scanner;

public class conversionAnyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        System.out.println(convert(sb,db,sn));
    }

    public static int convert(int sb, int db, int sn){
        int mul = 1;
        int ans = 0;
        while(sn!=0){
            int rem = sn % 10;
            ans += rem * mul;
            mul *= sb;
            sn /= 10;
        }
        mul = 1;
        sn = ans;
        ans = 0;

        while(sn!=0){
            int rem = sn % db;
            ans = ans + rem * mul;
            mul = mul * 10;
            sn = sn / db;
        }
        return ans;
    }
}
