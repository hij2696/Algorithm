// 정수를 나선형으로 배치하기

import java.util.Scanner;

class Solution {
    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1,  0};
    
    public static int x = 0, y = 0;
    public static int dirNum = 0;

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        answer[x][y] = 1;
        
        for(int i = 2; i <= n * n; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny, n) || answer[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;

            x += dx[dirNum]; 
            y += dy[dirNum];
            answer[x][y] = i;
        }
        
        return answer;
    }
}