// OX퀴즈

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] strArr = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(strArr[0]);
            int num2 = Integer.parseInt(strArr[2]);
            int num3 = Integer.parseInt(strArr[4]);
            
            if (strArr[1].equals("+")) {
                if ((num1 + num2) == num3) answer[i] = "O";
                else answer[i] = "X";
            }
            
            if (strArr[1].equals("-")) {
                if ((num1 - num2) == num3) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        
        return answer;
    }
}