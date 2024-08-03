package Leetcode;

public class searchInsertPositions {
    public static void main(String[] args) {
        int[]nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[]nums, int target){
        int index = 0;
        int lo = 0;
        int hi = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (lo+hi)/2 ;
            if(nums[mid] == target || (nums[mid]>target && nums[mid-1]<target&& mid!=-1)){
                index = mid;
            }else if(nums[mid]<target&& mid!=-1){
                lo = mid + 1;
                index = mid + 1;
            }else if(nums[mid]>target&& mid!=-1){
                hi = mid - 1;
                index = mid - 1;
            }
//            else if(nums[mid]>target && nums[mid-1]<target){
//                index = mid;
//            }
        }
        return index;
    }
}
