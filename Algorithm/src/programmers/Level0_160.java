// 주사위 게임 2

class Solution {
    public int solution(int a, int b, int c) {
        int num1 = a + b + c;
        int num2 = ((a * a) + (b * b) + (c * c));
        int num3 = ((a * a * a) + (b * b * b) + (c * c * c));
        
        if (a != b && a != c && b != c) return num1;
        else if (a == b && a == c && b == c) return num1 * num2 * num3;
        else return num1 * num2;
    }
}