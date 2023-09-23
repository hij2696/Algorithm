// 모음 제거

class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        
        return answer;
    }
}