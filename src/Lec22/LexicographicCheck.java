package Lec22;

public class LexicographicCheck {
    public static void main(String[] args) {
        String s1 = "tejaszzz";
        String s2 = "tejas";
        System.out.println(s1.compareTo(s2)); //this is the inbuilt method now let us create our own compareTo method
//        String s3 = "tejazzzz";
//        String s4 = "tejas";
        System.out.println(owncompareTo(s1,s2));
    }
    public static int owncompareTo(String s1, String s2){
        if(s1 == s2){
            return 0;
        }
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len != s2Len){
            int compareLen = Math.min(s1Len,s2Len);
            for (int i = 0; i < compareLen; i++) {
                if(s1.charAt(i) != s2.charAt(i)){
                    return s1.charAt(i) - s2.charAt(i);
                }
            }
        }
        return s1Len - s2Len;
    }
}
