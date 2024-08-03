package Lec22;

public class string_demo {
    public static void main(String[] args) {
        String s = "My name is Tejas"; // in the pool
        String s1 = "My name is Tejas"; //in the pool
        String s2 = new String("This is a new string which is outside of pool");
        String s3 = new String("This is a new string which is outside of pool");
        System.out.println(s+s1); //s and s1 have the same address but when we concatenate them their copy is created outside of pool and then they are concatenated
        System.out.println(s2);
        System.out.println(s == s1); // s and s1 has same address
        System.out.println(s2 == s3); //because s2 and s3 are created outside pool and have different addresses
        System.out.println(s2.equals(s3)); //method to check equals to in java
        System.out.println(s.charAt(3));
    }
}
