package Assignment2;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimumFah = sc.nextInt();
        int maximumFah = sc.nextInt();
        int step = sc.nextInt();
        int diff = maximumFah - minimumFah;
        float fah = minimumFah;
        float cel = 0;
        while(fah <= maximumFah) {
            cel = (5 / 9f) * (fah - 32);
            System.out.print((int) fah+"\t");
            System.out.println((int) (cel));
            fah = fah + step;
        }
    }
}
