// 배열 만들기 5

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String strs : intStrs) {
            String str = strs.substring(s, s + l);
            int num = Integer.parseInt(str);
            if (k < num) list.add(num);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i).intValue();
        
        return answer;
    }
}