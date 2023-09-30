// 1로 만들기

class Solution {
    public int division(int n) {
        int cnt = 0;
        
        while (n != 1) {
            n /= 2;
            cnt++;
        }
        
        return cnt;
    }
    
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            answer += division(num_list[i]);
        }
        
        return answer;
    }
}