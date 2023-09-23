// 중복된 숫자 개수

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++)
            if (n == array[i])
                answer++;
        
        return answer;
    }
}