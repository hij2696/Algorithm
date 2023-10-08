// x만큼 간격이 있는 n개의 숫자

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for (int j = 0; j < n; j++){
            answer[j] = num;
            num += x;
        }
        return answer;
    }
}