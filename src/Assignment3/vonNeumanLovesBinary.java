package Assignment3;

import java.util.Scanner;

public class vonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int binary = sc.nextInt();
            System.out.println(binaryToDecimal(binary));
        }
    }
    public static int binaryToDecimal(int binary){
        double ans = 0;
        int n = 0;
        while(binary!=0){
            int rem = binary % 10;
            ans = ans + rem * Math.pow(2,n);
            n++;
            binary/=10;
        }
        return (int)ans;
    }
}
