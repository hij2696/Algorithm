// 최댓값 만들기 (2)

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    answer = Math.max(numbers[i] * numbers[j], answer);
                else
                    continue;
            }
        }
        
        return answer;
    }
}