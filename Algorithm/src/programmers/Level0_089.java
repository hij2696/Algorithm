// 유한소수 판별하기

class Solution {
    
    public int gcd(int n, int m) {
        if (n < m) {
            int tmp = n;
            n = m;
            m = tmp;
        }
        
        while(m != 0) {
            int mod = n % m;
            n = m;
            m = mod;
        }
        
        return n;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        
        int num = b / gcd(a, b);
        
        while (true) {
            if (num % 2 != 0) break;
            else num /= 2;
        }
        
        while (true) {
            if (num % 5 != 0) break;
            else num /= 5;
        }
        
        if (num == 1) answer = 1;
        else answer = 2;
        
        return answer;
    }
}