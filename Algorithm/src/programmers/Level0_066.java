// 숫자 찾기

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int reverseNum = 0;
        int cnt = 0;
        
        while (num > 0) {
            reverseNum = (reverseNum * 10) + (num % 10);
            num /= 10;
            cnt++;
        }
        
        for (int i = 1; i <= cnt; i++) {
            if (reverseNum % 10 == k) {
                answer = i;
                break;
            }
            else {
                answer = -1;
            }
            reverseNum /= 10;
        }
        
        return answer;
    }
}