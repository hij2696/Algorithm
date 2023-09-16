class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == 'z') {
                sb.append("0");
                i += 3;
            }
            else if (numbers.charAt(i) == 'o') {
                sb.append("1");
                i += 2;
            }
            else if (numbers.charAt(i) == 't') {
                if (numbers.charAt(i + 1) == 'w') {
                    sb.append("2");
                    i += 2;
                }
                else {
                    sb.append("3");
                    i += 4;
                }
            }
            else if (numbers.charAt(i) == 'f') {
                if (numbers.charAt(i + 1) == 'o') {
                    sb.append("4");
                }
                else {
                    sb.append("5");
                }
                i += 3;
            }
            else if (numbers.charAt(i) == 's') {
                if (numbers.charAt(i + 1) == 'i') {
                    sb.append("6");
                    i += 2;
                }
                else {
                    sb.append("7");
                    i += 4;
                }
            }
            else if (numbers.charAt(i) == 'e') {
                sb.append("8");
                i += 4;
            }
            else if (numbers.charAt(i) == 'n') {
                sb.append("9");
                i += 3;
            }
        }
        
        return Long.parseLong(sb.toString());
    }
}