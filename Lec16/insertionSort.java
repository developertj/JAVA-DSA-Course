package Lec16;

public class insertionSort {
    public static void main(String[] args) {
        int[]arr = {5,3,-7,4,-8,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[]arr){
        for(int i=1;i< arr.length;i++){
            maxVal(arr,i);
        }
    }

    public static void maxVal(int[]arr,int i){
        int j = i-1;
        int item = arr[i];
        int count = 0;
        while(j>=0 && arr[j]>item ){
                arr[j+1] = arr[j];
                arr[j] = item;
            j--;
        }
//        for (int i = arr.length-2; i >= 0 ; i--) {
//            if(arr[i]<arr[i+2]){
//                int temp = arr[i+2];
//                arr[i+2] = arr[i];
//                arr[i] = temp;
//            }
//        }
    }
}
