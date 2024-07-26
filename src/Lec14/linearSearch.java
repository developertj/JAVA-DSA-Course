package Lec14;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int searchNum = sc.nextInt();
        int[] arr = {5,7,1,9,8,3,6};
        System.out.println(search(arr,searchNum));
    }
    public static int search(int[] arr, int searchNum){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchNum){
                return i;
            }
        }
        return -1;
    }
}
