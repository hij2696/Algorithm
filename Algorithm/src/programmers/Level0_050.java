class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        
        for (int i = 1; i <= 10; i++) {
            if (n > cnt * i) {
                cnt += cnt * i;
            }
            else {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}