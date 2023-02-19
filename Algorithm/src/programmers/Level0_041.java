class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (i != index && answer < max * numbers[i]) {
                answer = max * numbers[i];
            }
        }
        
        return answer;
    }
}