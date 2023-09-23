// 로그인 성공?

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    return answer;
                }
                else {
                    answer = "wrong pw";
                }
            }
        }
        if (answer.equals("wrong pw")) return answer;
        else {
            answer = "fail";
            return answer;
        }
    }
}