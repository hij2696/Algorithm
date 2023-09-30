// 배열 만들기 6

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                idx++;
            }
            else {
                if (list.get(idx) != arr[i]) {
                    list.add(arr[i]);
                    idx++;
                }
                else {
                    list.remove(idx--);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        for (int i = 0; i < list.size(); i++) stk[i] = list.get(i).intValue();
        
        return (list.isEmpty()) ? new int[] { -1 } : stk;
    }
}