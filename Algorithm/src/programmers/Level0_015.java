class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        while (true) {
            if (n <= slice) {
                answer++;
                break;
            }
            answer++;
            n -= slice;
        }
        
        return answer;
    }
}