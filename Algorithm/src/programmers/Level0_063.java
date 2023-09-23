// 인덱스 바꾸기

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] c = my_string.toCharArray();
        
        char tmp = c[num1];
        c[num1] = c[num2];
        c[num2] = tmp;
        
        String answer = String.valueOf(c);
        
        return answer;
    }
}