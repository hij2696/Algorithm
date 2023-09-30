// 왼쪽 오른쪽

class Solution {
    public String[] solution(String[] str_list) {
        int leftIdx = -1, rightIdx = -1;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                leftIdx = i;
                break;
            }
            if (str_list[i].equals("r")) {
                rightIdx = i;
                break;
            }
        }
        
        if (str_list.length == 1 || leftIdx == -1 && rightIdx == -1) return new String[0];
        
        if (leftIdx != -1) {
            String[] s = new String[leftIdx];
            for (int i = 0; i < s.length; i++) s[i] = str_list[i];
            return s;
        }
        
        if (rightIdx != -1) {
            String[] s = new String[str_list.length - rightIdx - 1];
            for (int i = rightIdx + 1; i < str_list.length; i++) s[i - rightIdx - 1] = str_list[i];
            return s;
        }
        
        return new String[0];
        
//        for (int i = 0; i < str_list.length; i++) {
//            if ("l".equals(str_list[i])) return Arrays.copyOfRange(str_list, 0, i);
//            else if ("r".equals(str_list[i])) return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//        }
//
//        return new String[0];
    }
}