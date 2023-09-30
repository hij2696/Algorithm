// 배열의 길이를 2의 거듭제곱으로 만들기

class Solution {
    public int[] solution(int[] arr) {
        int num = arr.length, cnt = 0;
        
        if (num == 1) return arr;
        else {
            while (num != 1) {
                num = (num / 2) + (num % 2);
                cnt++;
            }
        }
        
        int[] answer = new int[(int)Math.pow(2, cnt)];
        for (int i = 0; i < arr.length; i++) answer[i] = arr[i];
        
        return answer;
        
//        int length = 1;
//        while (length < arr.length) length *= 2;
//
//        return Arrays.copyOf(arr, length);
    }
}