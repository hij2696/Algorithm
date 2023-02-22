class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0, idx = 0;
        int len = numbers.length - 1;
        
        for (int i = 0; i < k - 1; i++) {
            if (len - 1 == idx) idx = 0;
            else if (len == idx) idx = 1;
            else idx += 2;
        }
        
        answer = numbers[idx];
        
        return answer;
    }
}