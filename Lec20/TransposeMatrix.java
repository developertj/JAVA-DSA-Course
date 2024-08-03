package Lec20;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {{10,20,30,40},
                        {50,60,70,80},
                        {11,12,13,14},
                        {15,16,17,18}};
        Transpose(arr);
        Display(arr);
    }

    public static void Transpose(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void Display(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
