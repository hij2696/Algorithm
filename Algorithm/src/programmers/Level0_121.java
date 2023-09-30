// n번째 원소부터

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length - n + 1;
        int[] answer = new int[len];
        
        int idx = n - 1;
        for (int i = 0; i < len; i++) answer[i] = num_list[idx++];
        
        return answer;
    }
}