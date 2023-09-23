// 약수 구하기

class Solution {
    public int[] solution(int n) {
        int cnt = 0, i = 1;
        while (i <= n) {
            if (n % i == 0) {
                cnt++;
            }
            i++;
        }
        
        int[] answer = new int[cnt];
        int j = 1, k = 0;
        while (j <= n) {
            if (n % j == 0) {
                answer[k] = j;
                k++;
            }
            j++;
        }
        
        return answer;
    }
}