// ad 제거하기

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for (String s : strArr) {
            if (!s.contains("ad")) list.add(s);
        }
        
        return list.toArray(new String[list.size()]);
    }
}