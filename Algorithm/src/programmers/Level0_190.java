// 접미사 배열

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        
        for (int i = len - 1; i >= 0; i--) {
            answer[i] = my_string.substring(i, len);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}