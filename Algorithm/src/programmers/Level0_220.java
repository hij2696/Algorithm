// 그림 확대

import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String s = "";
            String[] arr = picture[i].split("");
            
            for (int j = 0; j < arr.length; j++) s += arr[j].repeat(k);
            
            for (int j = 0; j < k; j++) list.add(s);
        }
        
        return list.toArray(new String[list.size()]);
    }
}