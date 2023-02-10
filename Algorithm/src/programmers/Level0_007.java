class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerAns = (numer1 * denom2) + (numer2 * denom1);
		int denomAns = denom1 * denom2;
		
		for (int i = numerAns - 1; i > 1; i--) {
			if (numerAns % i == 0 && denomAns % i == 0) {
				numerAns /= i;
				denomAns /= i;
			}
		}
		
		int[] answer = { numerAns, denomAns };
        
        return answer;
    }
}