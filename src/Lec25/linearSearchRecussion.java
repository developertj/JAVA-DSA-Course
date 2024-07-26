package Lec25;

public class linearSearchRecussion {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,8,9};
        int n = 4;
        System.out.println(linearSearch(arr,n,0));
    }
    public static int linearSearch(int []arr, int n, int i){
        if(arr[i] == n){
            return i;
        }
        return linearSearch(arr, n, i+1);
    }

}
