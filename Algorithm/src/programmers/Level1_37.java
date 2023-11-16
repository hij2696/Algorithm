// 최소 직사각형

class Solution {
    public int solution(int[][] sizes) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < sizes.length; i++) {
            int row = sizes[i][0];
            int column = sizes[i][1];
            
            if (row > column) {
                int tmp = row;
                row = column;
                column = tmp;
            }
            
            max1 = Math.max(max1, row);
            max2 = Math.max(max2, column);
        }
        
        return max1 * max2;
    }
}