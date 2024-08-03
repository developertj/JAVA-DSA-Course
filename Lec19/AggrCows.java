package Lec19;

import java.util.Arrays;
import java.util.Scanner;

public class AggrCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] stall = new int[n];
            for (int i = 0; i < n; i++) {
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(findLargeDistance(stall, c));
            t--;
        }
    }
//SAMPLE INPUT
    // N = 5
    //C = 3
    //ARRAY = {1,2,4,8,9}
    //INDEX    0,1,2,3,4
    public static int findLargeDistance(int[] stall, int c) {
        int n = stall.length;
        int ans = 0;
        int lo = 0;//0
        int hi = stall[n-1] - stall[0];//8 //3
        while(lo <= hi){//0<=8 0<=3
            int mid = (lo+hi)/2;//4 //1
            if(isCowPossible(stall, c, mid) == true){ //false
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1; //hi = 4-1 = 3
            }
        }
        return ans;
    }
    public static boolean isCowPossible(int[] stall, int c, int mid){
        int cow = 1; //cow = 2 //cow = 1 COW = 2
        int pos = stall[0];//1 8 //1 2
        for (int i = 1; i < stall.length; i++) {//i=1 //i=2 //i=3 //i=4 //i=1
            if(stall[i] - pos >= mid){//2-1>=4 x 4-1>=4 x 8-1>=4 9-8>=4 x 2-1>=1
                pos = stall[i]; //pos == 8  POS = 2
                cow++; //cow = 2 COW = 2
            }
            if(cow == c){
                return true;
            }
        }
        return false;
    }
}
