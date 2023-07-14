import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        String beforeStr = new String(beforeChar);
        String afterStr = new String(afterChar);
        
        if (beforeStr.equals(afterStr)) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}