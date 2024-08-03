package Lec4;
import java.util.*;

public class marksGrading {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();

        if(marks>90){
            System.out.println("Grade O");
        }else if(marks<=90 && marks>80){
            System.out.println("Grade A+");
        }else if(marks<=80 && marks>70){
            System.out.println("Grade A");
        }else if(marks<=70 && marks>50) {
            System.out.println("Pass");
        }else if(marks<50){
            System.out.println("Fail");
        }
    }
}
