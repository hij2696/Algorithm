// 같은 숫자는 싫어

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) queue.add(arr[i]);
        }
        
        int[] answer = new int[queue.size()];
        int idx = 0;
        while (!queue.isEmpty()) answer[idx++] = queue.poll();

        return answer;
    }
}