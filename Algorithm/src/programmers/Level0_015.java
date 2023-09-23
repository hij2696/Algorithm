// 피자 나눠 먹기 (3)

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