package Lec19;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int nBooks = sc.nextInt();
            int mStudents = sc.nextInt();
            int []arrPages = new int[nBooks];
            for (int i = 0; i < nBooks; i++) {
                arrPages[i] = sc.nextInt();
            }
            System.out.println(allocate(mStudents, arrPages));
        }
    }

    public static int allocate(int mStudents, int []arrPages){
        int hi = 0;
        for (int i = 0; i < arrPages.length; i++) {
            hi += arrPages[i];
        }
        int lo = 0;
        int ans = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(isPossible(mid, mStudents, arrPages) == true){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int mid, int mStudents, int []arrPages){
        int student = 1;
        int readPages = 0;
        int i = 0;
        while(i < arrPages.length){
            if(readPages+arrPages[i] <= mid){
                readPages += arrPages[i];
                i++;
            }else{
                student++;
                readPages = 0;
            }
            if(student > mStudents){
                return false;
            }
        }
        return true;
    }
}
