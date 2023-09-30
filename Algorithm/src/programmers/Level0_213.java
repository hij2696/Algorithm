// 조건에 맞게 수열 변환하기 2

class Solution {
    public final int MAX_X = 7;
    
    public int solution(int[] arr) {
        int answer = 0;
        int[][] arr2d = new int[MAX_X][arr.length];
        arr2d[0] = arr.clone();
        
        for (int i = 1; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i - 1][j] >= 50 && arr2d[i - 1][j] % 2 == 0) arr2d[i][j] = arr2d[i - 1][j] / 2;
                else if (arr2d[i - 1][j] < 50 && arr2d[i - 1][j] % 2 != 0) arr2d[i][j] = (arr2d[i - 1][j] * 2) + 1;
                else arr2d[i][j] = arr2d[i - 1][j];
            }
            
            boolean checked = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr2d[i][j] != arr2d[i - 1][j]) {
                    checked = false;
                    break;
                }
            }
            
            if (checked) break;
            answer++;
        }
        
        return answer;
    }
}