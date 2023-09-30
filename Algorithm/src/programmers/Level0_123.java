// 원소들의 곱과 합

class Solution {
    public int solution(int[] num_list) {
        int numSum = 0, numMul = 1;
        
        for (int num : num_list) {
            numSum += num;
            numMul *= num;
        }
        
        if (Math.pow(numSum, 2) > numMul) return 1;
        else return 0;
    }
}