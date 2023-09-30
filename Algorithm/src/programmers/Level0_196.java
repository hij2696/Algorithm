// 세 개의 구분자

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        
        String[] str = myStr.split("[a-c]");
        for (String s : str) {
            if (!s.isEmpty()) list.add(s);
        }
        
        return (list.isEmpty()) ? new String[]{ "EMPTY" } : list.toArray(new String[list.size()]);
    }
}