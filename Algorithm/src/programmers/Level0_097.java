// 안전지대

class Solution {
    
    public boolean inRange(int x, int y, int size) {
        return (0 <= x && x < size && 0 <= y && y < size);
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        
        int len = board.length;
        int[] dx = new int[]{ -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = new int[]{ -1, 0, 1, -1, 1, -1, 0, 1 };
        
        int x, y, nx, ny;
        for (x = 0; x < len; x++) {
            for (y = 0; y < len; y++) {
                if (board[x][y] == 1) {
                    for (int index = 0; index < 8; index++) {
                        nx = x + dx[index];
                        ny = y + dy[index];
                        if (inRange(nx, ny, len) && board[nx][ny] != 1) board[nx][ny] = -1;
                    }
                }
            }
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}