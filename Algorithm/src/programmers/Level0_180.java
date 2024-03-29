// 문자열 잘라서 정렬하기

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (String s : splitArr) {
            if (!s.isEmpty()) list.add(s);
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}