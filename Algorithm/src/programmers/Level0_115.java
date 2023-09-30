// 두 수의 연산값 비교하기

class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt("" + a + b);
        int num2 = a * b * 2;
        
        return num1 > num2 ? num1 : num2;
    }
}