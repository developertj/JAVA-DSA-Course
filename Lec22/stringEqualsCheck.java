package Lec22;

public class stringEqualsCheck {
    public static void main(String[] args) {
        String s1 = "tejas";
//        String s2 = "tejas";
        String s2 =new String("tejas") ;
        System.out.println(isEqual(s1,s2));
    }
    public static boolean isEqual(String s1,String s2){
        if(s1 == s2){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
