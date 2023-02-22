class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxVal = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
                answer[0] = maxVal;
                answer[1] = i;
            }
        }
        
        return answer;
    }
}