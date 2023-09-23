// 삼각형의 완성조건 (1)

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                if (sides[i] < sides[j]) {
                    int tmp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = tmp;
                }
            }
        }
        
        if (sides[0] < sides[1] + sides[2]) answer = 1;
        else answer = 2;
        
        return answer;
    }
}