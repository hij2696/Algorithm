class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            int cnt = 0;
            
            for (int i = n / 2; i > 1; i--) {
                if (n % i == 0) {
                    cnt++;
                }
                if (cnt == 1) {
                    answer++;
                    break;
                }
            }
            n--;
        }
        
        return answer;
    }
}