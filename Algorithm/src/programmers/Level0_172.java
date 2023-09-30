// 글자 이어 붙여 문자열 만들기

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        
        for (int i = 0; i < index_list.length; i++) {
            answer += charArr[index_list[i]];
        }
        
        return answer;
    }
}