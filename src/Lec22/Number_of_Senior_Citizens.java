package Lec22;
//https://leetcode.com/problems/number-of-senior-citizens/description/
public class Number_of_Senior_Citizens {
    public static void main(String[] args) {
        String s = "2941701174O9278";
//        int = (int) s.charAt(0);
       // String thirteen  = new String(s.charAt(3)) ;
        int count = 0;
        if(Character.getNumericValue(s.charAt(11))>6){
            count++;
        }
//        for (int i = 0; i < details.length; i++) {
//
//            // System.out.println(details.charAt(i));
//            // count++;
//        }
        char new1 = s.charAt(11);
        char new2 = s.charAt(12);
        String newStr = String.valueOf(new1) + String.valueOf(new2);
        System.out.println(newStr);
        int newInt = Integer.parseInt(newStr);
        System.out.println(newStr);
    }
}
