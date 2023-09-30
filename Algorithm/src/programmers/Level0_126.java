// 배열의 원소만큼 추가하기

class Solution {
    public int[] solution(int[] arr) {
        int sum = 0, idx = 0;
        for (int element : arr) sum += element;
        
        int[] answer = new int[sum];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}