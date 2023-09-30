// 문자열 바꿔서 찾기

class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        for (char c : myString.toCharArray()) {
            s += (c == 'A') ? "B" : "A";
        }
        
        return (s.contains(pat)) ? 1 : 0;
    }
}