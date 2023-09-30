// 무작위로 K개의 수 뽑기

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean checked = true;
            
            for (int j = 0; j < k; j++) {
                if (arr[i] == answer[j]) {
                    checked = false;
                    break;
                }
            }
            
            if (checked) answer[idx++] = arr[i];
            if (idx == k) break;
        }
        
        return answer;
    }
}