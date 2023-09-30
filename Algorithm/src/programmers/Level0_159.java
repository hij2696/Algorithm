// 등차수열의 특정한 항만 더하기

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = included[0] ? a : 0;
        int sum = a;
        
        for (int i = 1; i < included.length; i++) {
            sum += d;
            answer += included[i] ? sum : 0;
        }
        
        return answer;
    }
}