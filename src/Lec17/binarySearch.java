package Lec17;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,8,9,11,13,15,20,21};
        int item = 13;
        System.out.println(BinarySearch(arr,item));
    }
    public static int BinarySearch(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
