// 가까운 수

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0, difference = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (difference == Math.abs(array[i] - n)) {
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
            else if (difference > Math.abs(array[i] - n)) {
                difference = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        
        return answer;
    }
}