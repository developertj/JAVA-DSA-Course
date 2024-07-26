package Lec14;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {4,7,1,8,3,9,8,2};
        reverse(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //reverse part of a array
    public static void reverse(int[] arr){
        int i = 2;
        int j = arr.length - 2;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //reverse whole array
//    public static void reverse(int[] arr){
//        int i = 2;
//        int j = arr.length - 2;
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
}
