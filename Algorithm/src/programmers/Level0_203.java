// 빈 배열에 추가, 삭제하기

import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                    idx++;
                }
            }
            else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(idx--);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i).intValue();
        
        return answer;
    }
}