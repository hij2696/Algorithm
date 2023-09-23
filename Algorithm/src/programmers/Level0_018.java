// 아이스 아메리카노

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee_num = 0;
        
        while (money >= 5500) {
            coffee_num++;
            money -= 5500;
        }
        
        answer[0] = coffee_num;
        answer[1] = money;
        
        return answer;
    }
}