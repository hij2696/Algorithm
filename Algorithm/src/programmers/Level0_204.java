// 글자 지우기

import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArr = new char[my_string.length() - indices.length];
        int charArrIdx = 0, indicesIdx = 0;
        
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
            if (i == indices[indicesIdx]) {
                if (indicesIdx == indices.length - 1) continue;
                else indicesIdx++;
            }
            else charArr[charArrIdx++] = my_string.charAt(i);
        }
        
        return new String(charArr);
    }
}