// 코드 처리하기

class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if (mode) {
                if (i % 2 != 0) ret += String.valueOf(code.charAt(i));
            }
            else {
                if (i % 2 == 0) ret += String.valueOf(code.charAt(i));
            }
        }
        
        if (ret.equals("")) return "EMPTY";
        else return ret;
    }
}