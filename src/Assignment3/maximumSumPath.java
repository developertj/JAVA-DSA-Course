package Assignment3;

import java.util.Scanner;

public class maximumSumPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];

            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println(findPath(arr1, arr2, m, n));
            t--;
        }

    }
    public static int findPath(int[]arr1, int[]arr2, int m, int n){
        int s1 = 0;
        int s2 = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i < m && j <n){
            if(arr1[i] < arr2[j]){
                s1 += arr1[i];
                i++;
            } else if(arr2[j] < arr1[i]){
                s2 += arr2[j];
                j++;
            } else if(arr1[i] == arr2[j]){
                ans += Math.max(s1, s2) + arr1[i];
                i++;
                j++;
                s1 = 0;
                s2 = 0;
            }
        }

        while(i < m){
            s1 += arr1[i];
            i++;
        }
        while(j < n){
            s2 += arr2[j];
            j++;
        }
        ans += Math.max(s1,s2);
        return ans;
    }
}
