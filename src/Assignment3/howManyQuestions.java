package Assignment3;

import java.util.Scanner;

public class howManyQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int question = 0;
        for(int j = 0; j < n; j++){
            int []arr = new int[3];
            for (int k = 0; k < 3; k++) {
                arr[k] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1){
                    count++;
                }
            }
            if(count==2){
                question++;
            }
        }
        System.out.println(question);
    }
}
