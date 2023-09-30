// 배열 만들기 2

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i ++) {
            String s = Integer.toString(i);
            boolean checked = true;
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (('1' <= c && c <= '4') || '6' <= c && c <= '9') {
                    checked = false;
                    break;
                }
            }
            if (checked) list.add(Integer.parseInt(s));
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i).intValue();
        
        return (answer.length != 0) ? answer : new int[] { -1 };
    }
}