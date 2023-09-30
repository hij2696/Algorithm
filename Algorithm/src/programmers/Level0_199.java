// 수열과 구간 쿼리 2

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for (int i = 0; i < queries.length; i++) {
            int idx = -1, min = Integer.MAX_VALUE;
            
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            
            if (idx != -1) answer[i] = arr[idx];
        }
        
        return answer;
    }
}