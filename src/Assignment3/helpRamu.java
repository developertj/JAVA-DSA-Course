package Assignment3;

import java.util.Scanner;

public class helpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int[]cost = new int[4];
            for (int i = 0; i < cost.length; i++) {
                cost[i] = sc.nextInt();
            }
            int n = sc.nextInt(); //number of rickshaw ramu uses
            int m = sc.nextInt(); //number of cabs ramu uses
            int[] rickshaws = new int[n];
            for (int i = 0; i < n; i++) {
                rickshaws[i] = sc.nextInt();
            }
            int[] cabs = new int[m];
            for (int i = 0; i < m; i++) {
                cabs[i] = sc.nextInt();
            }
            System.out.println(returnMin(cost, rickshaws, cabs));
        }
    }
    public static int returnMin(int[]cost, int[]rickshaws, int[]cabs){
        int finalTotalMinValue = 0;
        int sumTotalRickshaw = 0;
        int sumTotalcab = 0;
        int finalRickshawMin = 0;
        int finalcabMin = 0;
        //int[]arrMinRickshaw = new int[rickshaws.length];
        for (int j = 0; j < rickshaws.length; j++) {
            int mincost = Math.min((rickshaws[j] * cost[0]), cost[1]);
            sumTotalRickshaw += mincost;
        }
        finalRickshawMin = Math.min(sumTotalRickshaw, cost[2]);

        for (int k = 0; k < cabs.length; k++) {
            int mincost = Math.min((cabs[k] * cost[0]), cost[1]);
            sumTotalcab += mincost;
        }
        finalcabMin = Math.min(sumTotalcab, cost[2]);
        finalTotalMinValue = Math.min((finalRickshawMin+finalcabMin),cost[3]);
        return finalTotalMinValue;
    }
}
