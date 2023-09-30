// 할 일 목록

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0, idx = 0;
        for (boolean checked : finished) len += checked ? 0 : 1;
        
        String[] answer = new String[len];
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) answer[idx++] = todo_list[i];
        }
        
        return answer;
    }
}