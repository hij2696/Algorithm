// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String s = myString.substring(i, i + pat.length());
            if (s.equals(pat)) answer = myString.substring(0, i + pat.length());
        }
        
        return answer;
        
        // return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}