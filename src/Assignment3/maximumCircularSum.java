package Assignment3;

import java.util.Scanner;

public class maximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test case
        while(t--!=0){
            int n = sc.nextInt(); //size of array
            int[]arr = new int[n];
            int[]temp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            if(n == 1){
                System.out.println(arr[0]);
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            int curr_max = arr[0];
            int msf = arr[0];
            int curr_min = arr[0];
            int minsf = arr[0];
            for (int i = 0; i < n; i++) {
                curr_max = Math.max(curr_max+arr[i], arr[i]);
                msf = Math.max(curr_max,msf);

                curr_min = Math.min(curr_min+arr[i], arr[i]);
                minsf = Math.min(curr_min,minsf);
            }

            if(minsf==sum){
                System.out.println(msf);
            }
            System.out.println(Math.max(msf, sum-minsf));
        }
    }
}
