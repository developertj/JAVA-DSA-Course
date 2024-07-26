package Assignment2;

import java.util.Scanner;

public class printSeries {
    public static int n;
    public static int ans;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        n = 1;
        print(n1, n2);
    }
    public static void print(int n1, int n2){
        for(int i = 1; i <= n1; i++){
            ans = ((3*n)+2);//1 5, 2 8, 3 11, 4 14, 5 17, 6 20, 7 23, 8 26, 9 29, 10 32
            int check = ans % n2; // 4%5
            if(check!=0){ //4%5!=0; 4%8==0
                System.out.println(ans);
            }else{
                i--;
            }
//            System.out.println(check);
//            System.out.println(ans);
            n++;
        }
    }
}
