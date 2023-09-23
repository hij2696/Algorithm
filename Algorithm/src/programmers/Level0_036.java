// 2차원으로 만들기

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len1 = num_list.length / n;
        int len2 = num_list.length / len1;
        
        int[][] answer = new int[len1][len2];
        int k = 0;
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                answer[i][j] += num_list[i + j + k];
            }
            k =  k + len2 - 1;
        }
        
        return answer;
    }
}