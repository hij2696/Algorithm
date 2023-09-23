// 문자열 정렬하기 (2)

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] sArr = my_string.toLowerCase().split("");
        
        Arrays.sort(sArr);
        
        for (String s : sArr) answer += s;
        
        return answer;
    }
}