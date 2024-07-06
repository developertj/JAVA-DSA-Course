package Lec16;

public class selectionSort {
    public static void main(String[] args) {
        int []arr = {5,3,-7,4,-8,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
//        System.out.println(minValue(arr));
    }

    public static void sort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min = minValue(arr,i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static  int minValue(int[]arr,int index){
        int idx = index;
        for(int i = index+1 ; i < arr.length;i++){
            if(arr[i] < arr[idx]){
                idx = i;
            }
        }
        return idx;
    }
}
