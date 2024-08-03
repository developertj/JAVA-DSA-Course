package Assignment3;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int [n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        findMajorityElement(nums,n);
    }
    public static void findMajorityElement(int[]arr,int n){
        int majority = arr[0];
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0 ; j < n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > (n/2)){
                majority = arr[i];
            }
        }
        System.out.println(majority);
    }
}
