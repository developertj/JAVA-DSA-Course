package Assignment2;

import java.util.Scanner;

import static java.lang.Character.getType;

public class printArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        print(n1,n2);
    }
    public static void print(int n1, int n2){
        int length1 = (int) (Math.log10(n1)+1);
        while(n1<=n2){
            int isArmstrong = 0;
            int n = n1;
            while(n!=0){
                int rem = n % 10;
                isArmstrong += (int) (Math.pow(rem,length1));
                n /= 10;
            }
            if(n1==isArmstrong){
                System.out.println(isArmstrong);
            }
            n1++;
        }
    }
}
