class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int xBoardMax = board[0] / 2;
        int xBoardMin = (board[0] / 2) * (-1);
        int yBoardMax = board[1] / 2;
        int yBoardMin = (board[1] / 2) * (-1);
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) answer[0]--;
            else if (keyinput[i].equals("right")) answer[0]++;
            else if (keyinput[i].equals("down")) answer[1]--;
            else answer[1]++;
            
            if (answer[0] > xBoardMax) answer[0] = xBoardMax;
            if (answer[0] < xBoardMin) answer[0] = xBoardMin;
            if (answer[1] > yBoardMax) answer[1] = yBoardMax;
            if (answer[1] < yBoardMin) answer[1] = yBoardMin;
        }
        
        return answer;
    }
}