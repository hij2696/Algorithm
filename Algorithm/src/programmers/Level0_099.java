// 평행

class Solution {
    
    public static float slope(int[] arr1,int[] arr2) {
        float num1, num2;

            num1 = arr1[0] - arr2[0];
            num2 = arr1[1] - arr2[1];

        return num2 / num1;
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        int len = dots.length;
        
        for (int i = 0; i < len; i++) {
            float tmp1 = slope(dots[i], dots[(i + 1) % len]);
            float tmp2 = slope(dots[(i + 2) % len],dots[(i + 3) % len]);

            if (tmp1 == tmp2) answer = 1;
        }
        
        return answer;
    }
}