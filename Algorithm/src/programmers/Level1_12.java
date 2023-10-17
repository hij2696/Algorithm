// 하샤드 수

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x, intMod = 0;
        String strMod = "";
        
        while (tmp > 0) {
            strMod += String.valueOf(tmp % 10);
            tmp /= 10;
        }
        
        for (int i = 0; i < strMod.length(); i++)
            intMod += strMod.charAt(i) - '0';
        
        if (x % intMod == 0) return answer;
        else {
            answer = false;
            return answer;
        }
    }
}