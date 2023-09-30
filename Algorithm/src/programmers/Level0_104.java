// 대소문자 바꿔서 출력하기

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";
        
        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) ans += Character.toUpperCase(c);
            else ans += Character.toLowerCase(c);
        }
        
        System.out.print(ans);
    }
}