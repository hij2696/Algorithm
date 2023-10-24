// 없는 숫자 더하기 

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] cntArr = new int[10];
        
        for (int i = 0; i < numbers.length; i++) cntArr[numbers[i]]++;
        
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == 0) answer += i;
        }
        
        return answer;
    }
}