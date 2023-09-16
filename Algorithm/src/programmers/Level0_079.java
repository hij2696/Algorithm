class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        answer += 2 * Math.min(sides[0], sides[1]) - 1;
        
        return answer;
    }
}