package Lec14;

public class arrayMaxValue {
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,2,9,6,8};
        System.out.println(maxValue(arr));
    }
    //method1
//    public static int maxValue(int[] arr){
//        int m = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i]>m){
//                m = arr[i];
//            }
//        }
//        return m;
//    }
    //method2
//    public static int maxValue(int[] arr){
//        int m = Integer.MIN_VALUE;
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i]>m){
//                m = arr[i];
//            }
//        }
//        return m;
//    }
    //method3
    public static int maxValue(int[] arr){
        int m = arr[0];
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            max = Math.max(arr[i],m);
            m = max;
        }
        return m;
    }
}
