// 제일 작은 수 제거하기

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = { -1 };
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            else {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        
        return answer;
    }
}