package Practice;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,4,1,2,6,7,2};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                System.out.println("The number is found at index "+i);
            }
        }
    }
}
