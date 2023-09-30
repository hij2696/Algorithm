// 마지막 두 원소

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOf(num_list, len + 1);
        
        answer[len] = (num_list[len - 1] > num_list[len - 2]) ?
            num_list[len - 1] - num_list[len - 2] : num_list[len - 1] * 2;
        
        return answer;
    }
}