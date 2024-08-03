package Lec14;

import java.util.Scanner;

public class dcbNonAllergicArray {
    public static int[] arr1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        arr1 = new int[arr.length];
        noRepeat(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
    }
    public static void noRepeat(int[] arr){

        for(int i = 0; i<arr.length;i++){
            int count = 0;
            int check = arr[i];
            if(check == arr[i+1] && i+1<arr.length){
                count++;
            }else{
                arr1[i] = arr[i];
            }
        }
    }
}
