// 배열의 원소 삭제하기

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0, idx = 0;
        for (int i = 0; i < delete_list.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (delete_list[i] == arr[j]) {
                    cnt++;
                    break;
                }
            }
        }
        
        int[] answer = new int[arr.length - cnt];
        for (int i = 0; i < arr.length; i++) {
            boolean checked = true;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    checked = false;
                    break;
                }
            }
            if (checked) answer[idx++] = arr[i];
        }
        
        return answer;
    }
}