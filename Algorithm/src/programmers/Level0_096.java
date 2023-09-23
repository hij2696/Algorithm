// 연속된 수의 합

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if (num == 1) {
            answer[0] = total;
            return answer;
        }
        
        int idx = 0;
        if (total == 0) {
            for (int i = (num / 2) * (-1); i <= num / 2; i++) answer[idx++] = i;
            return answer;
        }
        
        int start = total * (-1), target = 0;
        boolean checked = false;
        
        while (true) {
            int result = 0, cnt = 0;
            
            for (int i = start; i <= total; i++) {
                result += i;
                ++cnt;
                if (num == cnt) {
                    if (result == total) {
                        target = i;
                        checked = true;
                        break;
                    }
                    else break;
                }
            }
            
            if (checked) break;
            else start++;
        }
        
        for (int i = target - num + 1; i <= target; i++) answer[idx++] = i;
        
        return answer;
    }
}