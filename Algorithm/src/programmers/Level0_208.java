// 2의 영역

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) idx.add(i);
        }
        
        List<Integer> list = new ArrayList<>();
        if (idx.isEmpty()) return new int[]{ -1 };
        else if (idx.size() == 1) return new int[]{ 2 };
        else if (idx.size() == 2) {
            for (int i = idx.get(0); i <= idx.get(1); i++) list.add(arr[i]);
        }
        else {
            for (int i = 0; i < idx.size() - 1; i++) {
                for (int j = idx.get(i); j < idx.get(i + 1); j++) list.add(arr[j]);
            }
            list.add(2);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i).intValue();
        
        return answer;
    }
}