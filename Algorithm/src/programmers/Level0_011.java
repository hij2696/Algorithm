// 최빈값 구하기

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] counter = new int[1001];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            counter[array[i]]++;
        }
        
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                answer = i;
            }
            else if (counter[i] == max) {
                answer = -1;
            }
        }
        
        return answer;
    }
}