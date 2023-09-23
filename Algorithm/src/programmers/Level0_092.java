// 문자열 밀기

class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        
        if (A.equals(B)) return 0;
        
        for (int i = 0; i < len - 1; i++) {
            String s = A.substring(len - 1 - i, len) + A.substring(0, len - 1 - i);
            if (s.equals(B)) return i + 1;
        }
        
        return -1;
    }
}