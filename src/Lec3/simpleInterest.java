package Lec3;
import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        int SI = (P*R*T)/100;
        System.out.println(SI);
    }
}
