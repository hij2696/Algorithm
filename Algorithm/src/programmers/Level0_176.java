// 순서 바꾸기

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        String s = "";
        for (int element : num_list) s += element;
        
        s = s.substring(n, num_list.length) + s.substring(0, n);
        for (int i = 0; i < s.length(); i++) answer[i] = s.charAt(i) - '0';
        
        return answer;
    }
}