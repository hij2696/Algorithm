// 정수 내림차순으로 배치하기

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = String.valueOf(n);
        String[] str = s.split("");
        Arrays.sort(str);
        
        for (int i = str.length - 1; i >= 0; i--) {
            if (i == 0) answer += Integer.parseInt(str[i]);
            else answer = (answer + Integer.parseInt(str[i])) * 10;
        }
        
        return answer;
    }
}