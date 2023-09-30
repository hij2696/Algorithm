// 문자열 여러 번 뒤집기

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            String s = "";
            int start = queries[i][0], end = queries[i][1];
            
            for (int j = end; j >= start; j--) {
                s += my_string.charAt(j);
            }
            my_string = my_string.substring(0, start) + s + my_string.substring(end + 1, my_string.length());
        }
        
        return my_string;
    }
}