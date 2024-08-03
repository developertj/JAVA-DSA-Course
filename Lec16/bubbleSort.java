package Lec16;

public class bubbleSort {
    public static void main(String[] args) {
        //int[] arr = {3,5,4,2,1};
        int[] arr = {5,3,-7,4,-8,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void sort(int[]arr){
        for (int j = 1; j < arr.length; j++) {
            for(int i=0;i<arr.length-j;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
//        public static void Sort(int[] arr) {
//            for (int turn = 1; turn < arr.length; turn++) {
//
//                for (int i = 0; i < arr.length - turn; i++) {0 5-1, 1 5-
//                    if (arr[i] > arr[i + 1]) {
//                        int temp = arr[i];
//                        arr[i] = arr[i + 1];
//                        arr[i + 1] = temp;
//                    }
//                }
//            }
//        }

    }
}
