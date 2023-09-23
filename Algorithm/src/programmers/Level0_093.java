// 다항식 더하기

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split("\\+");
        int num1 = 0, num2 = 0;
        
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll(" ", "");
            
            if (str[i].contains("x")) {
                str[i] = str[i].replace("x", "");
                
                if (str[i].equals("")) num1 += 1;
                else num1 += Integer.parseInt(str[i]);
            }
            else num2 += Integer.parseInt(str[i]);
        }
        
        if (num1 == 0) answer = String.valueOf(num2);
        else if (num1 == 1) {
            if (num2 == 0) answer = "x";
            else answer = "x + " + String.valueOf(num2);
        }
        else {
            if (num2 == 0) answer = String.valueOf(num1) + "x";
            else answer = String.valueOf(num1) + "x + " + String.valueOf(num2);
        }
        
        return answer;
    }
}