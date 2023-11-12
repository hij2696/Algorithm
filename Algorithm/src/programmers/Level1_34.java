// 이상한 문자 만들기

// 나의 풀이
import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        String[] letters = s.split("");
        boolean checked = true;

        for (String oneLetter : letters) {
            if (checked) sb.append(oneLetter.toUpperCase());
            else sb.append(oneLetter);

            checked = !checked;
            if (oneLetter.equals(" ")) checked = true;
        }

        return sb.toString();
    }
}

// PCCP 책 참고 풀이
//public class Solution {
//	public String solution(String s) {
//		StringBuilder sb = new StringBuilder();
//		boolean toUpper = true;
//		
//		for (char c : s.toCharArray()) {
//			if (!Character.isAlphabetic(c)) {
//				sb.append(c);
//				toUpper = true;
//			} else {
//				if (toUpper) sb.append(Character.toUpperCase(c));
//				else sb.append(Character.toLowerCase(c));
//				toUpper = !toUpper;
//			}
//		}
//		
//		return sb.toString();
//	}
//}