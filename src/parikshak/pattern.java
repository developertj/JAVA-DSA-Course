package parikshak;

public class pattern {
    public static void main(String[] args) {
        int n = 9;
        int nst = 1;
        int nst2 = (2*n)-3;
        int row = 1;
        int rowVal = n;
        int rowVal2 = n;
        int colVal2 = rowVal;

        while(row<=(2*n)-1){
            //left number
            int i = 1;
            int colVal = rowVal;

            while(i<=nst){
                System.out.print(colVal+" ");
                i++;
                colVal--;
            }
            //middle number
            int j = 1;
            while(j<=nst2){
                System.out.print(colVal2+" ");
                j++;
            }
            //right numbers
            int k = 1;
            int colVal3 = rowVal2;
            if(row == n){
                k = 2;
                colVal3++;
            }
            while(k<=nst){
                System.out.print(colVal3+" ");
                colVal3++;
                k++;
            }
            System.out.println();
            row++;
            if(row <= n){
                rowVal2--;
                colVal2--;
                nst++;
                nst2 -= 2;
            }else{
                rowVal2++;
                colVal2++;
                nst--;
                nst2+=2;
            }

        }
    }
}
