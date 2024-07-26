package Lec18;

public class timeComplexity {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);

        int n = 10;
        while(n > 0){//10/2=5, 5/2=2.5, 2.5/2=1.25, 1.25/2=0.625, 0.625/2=0.3125
            System.out.println("Hey");
            n /= 2;
        }
    }
}
