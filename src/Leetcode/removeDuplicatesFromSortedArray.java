package Leetcode;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[]nums = {0,0,1,1,1,2,2,3,3,4};
        int count = 0;
        int[]new_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; ) {
                if(nums[i] == nums[j]){
                    j++;
                }else{
                    new_nums[i] = nums[i];
                }
            }
        }
        for (int i = 0; i < new_nums.length; i++) {
            System.out.print(new_nums[i]+" ");
        }
    }
}
