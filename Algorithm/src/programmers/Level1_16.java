// 나누어 떨어지는 숫자 배열

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        for (int element : arr)
            if (element % divisor == 0)
                list.add(element);
        
        if (list.size() == 0) {
            int[] answer = { -1 };
            return answer;
        }
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }
}