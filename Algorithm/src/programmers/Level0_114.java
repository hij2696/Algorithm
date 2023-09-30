// 더 크게 합치기

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        
        answer = Integer.parseInt(str1) > Integer.parseInt(str2) ?
                 Integer.parseInt(str1) : Integer.parseInt(str2);
        
        return answer;
    }
}