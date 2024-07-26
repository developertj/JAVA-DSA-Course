package Lec6;
import java.util.*;

public class hwPattern7 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int nst = n;
      int row = 1;
      while(row <= n){
          int i = 1;
          while(i <= nst){
              System.out.print("*");
              i++;
          }

          System.out.println();
          row++;
      }

      }
    }

