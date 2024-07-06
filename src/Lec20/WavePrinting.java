package Lec20;

public class WavePrinting {
    public static void main(String[] args) {
        int [][] arr = {{10,20,30,40},
                        {50,60,70,80},
                        {11,12,13,14}};
        Display(arr);
    }
    public static void Display(int[][]arr){
        for (int j = 0; j < arr[0].length; j++) {
            if(j % 2 == 0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int i = arr.length-1; i >= 0 ; i--) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
