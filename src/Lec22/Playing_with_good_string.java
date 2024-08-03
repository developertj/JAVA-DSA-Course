package Lec22;

import java.util.Scanner;

public class Playing_with_good_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(goodString(s));
    }
    public static int goodString(String s){
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == 'a'||temp =='e'||temp =='i'||temp=='o'||temp=='u'){
                count++;
            }else{
                ans = Math.max(ans,count);
                count = 0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
