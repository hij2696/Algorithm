// 문자열 묶기

class Solution {
    public final int MAX_LEN = 30;
    
    public int solution(String[] strArr) {
        int max = Integer.MIN_VALUE;
        int[] cnt = new int[MAX_LEN + 1];
        
        for (String s : strArr) cnt[s.length()]++;
        for (int i = 0; i < cnt.length; i++) max = Math.max(max, cnt[i]);
        
        return max;
    }
}