// 옹알이 (1)

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
    	
        String[] str = new String[]{"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
        	String s = babbling[i];
        	
            for (int j = 0; j < str.length; j++) s = s.replace(str[j], "1");
            s = s.replaceAll("1", "");
            
            if (s.equals("")) answer++;
        }
        
        return answer;
    }
}