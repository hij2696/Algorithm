// 주사위 게임 3

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] diceNums = new int[]{a, b, c, d};
        int[] count = new int[7];
        
        for (int i = 0; i < 4; i++) count[diceNums[i]]++;
        
        boolean checked = false;
        for (int i = 1; i < 7; i++) {
            if (count[i] == 0) continue;
            
            if (count[i] == 4) {
                answer = 1111 * i;
                break;
            }
            else if (count[i] == 3) {
                for (int j = 1; j < 7; j++) {
                    if (count[j] == 1) {
                        answer = (int)Math.pow(10 * i + j, 2);
                        break;
                    }
                }
                break;
            }
            else if (count[i] == 1) {
                for (int j = 1; j < 7; j++) {
                    if (count[j] == 1 || count[j] == 2 || count[j] == 4) continue;
                    
                    if (count[j] == 3) {
                        answer = (int)Math.pow(10 * j + i, 2);
                        checked = true;
                        break;
                    }
                }
                if (checked) break;
                
                int min = i, cnt = 0;
                for (int j = 1; j < 7; j++) {
                    if (count[j] == 2 || count[j] == 4) continue;
                    if (i != j && count[j] == 1) {
                        min = Math.min(min, j);
                        cnt++;
                    }
                }
                if (cnt == 3) {
                    answer = min;
                    break;
                }
            }
            else {
                for (int j = 1; j < 7; j++) {
                    if (i != j && count[j] == 2) {
                        answer = (i + j) * Math.abs(i - j);
                        checked = true;
                    }
                }
                if (checked) break;
                
                int[] num = new int[2];
                int idx = 0;
                
                for (int j = 1; j < 7; j++) {
                    if (count[j] == 1) num[idx++] = j;
                }
                
                answer = num[0] * num[1];
                break;
            }
        }
        
        return answer;
        
//        int[] dice = { a, b, c, d };
//        Arrays.sort(dice);
//
//        int ans = 0;
//
//        if (dice[0] == dice[3]) {
//            ans = 1111 * dice[3];
//        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
//            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
//        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
//            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
//        } else if (dice[0] == dice[1]) {
//            ans = dice[2] * dice[3];
//        } else if (dice[1] == dice[2]) {
//            ans = dice[0] * dice[3];
//        } else if (dice[2] == dice[3]) {
//            ans = dice[0] * dice[1];
//        } else {
//            ans = dice[0];
//        }
//
//        return ans;
    }
}