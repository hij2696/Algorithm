// 길이에 따른 연산

class Solution {
    public int solution(int[] num_list) {
    	int answer = (num_list.length < 11 ? 1 : 0);
    	
        if (num_list.length <= 10) {
            for (int num : num_list) answer *= num;
        }
        else {
            for (int num : num_list) answer += num;
        }
        
        return answer;
    }
}