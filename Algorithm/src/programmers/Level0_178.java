// 가까운 1 찾기

class Solution {
    public int solution(int[] arr, int idx) {
        int index = 0;
        while (true) {
            if (index > arr.length - 1) break;
            if (index >= idx && arr[index] == 1) return index;
            index++;
        }
        return -1;
    }
}