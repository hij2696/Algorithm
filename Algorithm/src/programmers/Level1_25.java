// 문자열 내림차순으로 배치하기

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) sb.append(arr[i]);
        
        String answer = sb.reverse().toString();
        
        return answer;
    }
}