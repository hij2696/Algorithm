// 자연수 뒤집어 배열로 만들기

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}