// 정사각형으로 만들기

import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr.length, height = arr[0].length;
        boolean checked = true;
        int whDiff = 0, hwDiff = 0;
        
        if (width == height) return arr;
        else if (width > height) {
            whDiff = width - height;
            height = width;
        }
        else {
            hwDiff = height - width;
            width = height;
            checked = false;
        }
        
        int[][] answer = new int[width][height];
        List<Integer> list = new ArrayList<>();
        
        if (checked) {
            for (int[] smallArr : arr) {
                for (int element : smallArr) list.add(element);
                for (int i = 0; i < whDiff; i++) list.add(0);
            }
        }
        else {
            for (int[] smallArr : arr) {
                for (int element : smallArr) list.add(element);
            }
            for (int i = 0; i < hwDiff; i++) {
                for (int j = 0; j < height; j++) list.add(0);
            }
        }
        
        int idx = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                answer[i][j] = list.get(idx++).intValue();
            }
        }
        
        return answer;
        
//        int wh = Math.max(arr.length, arr[0].length);
//        int[][] answer = new int[wh][wh];
//
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[0].length; j++){
//                answer[i][j] = arr[i][j];
//            }
//        }
//        return answer;
    }
}