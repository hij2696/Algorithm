// 접미사인지 확인하기

class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.length() < is_suffix.length()) return 0;
        String s = my_string.substring(my_string.length() - is_suffix.length());
        
        return (s.equals(is_suffix)) ? 1 : 0;
        
        // return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}