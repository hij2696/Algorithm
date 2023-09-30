// 커피 심부름

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("la")) answer += 5000;
            else answer += 4500;
        }
        
        return answer;
    }
}