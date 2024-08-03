package Lec14;

public class swapArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,7};
        int[] arr2 = {5,6,7,8,9};
        swapWholeArray(arr1,arr2);
        System.out.println("Array1 is");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array2 is");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    public static void swapWholeArray(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
}
