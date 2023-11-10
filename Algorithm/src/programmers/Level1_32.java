// 3진법 뒤집기

class Solution {
    public int solution(int n) {
        String tripleDigit = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(tripleDigit).reverse();
        
        String reverseTripleDigit = sb.toString();
        int answer = Integer.parseInt(reverseTripleDigit, 3);
        
        return answer;
    }
}