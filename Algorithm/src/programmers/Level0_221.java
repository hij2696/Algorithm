// 전국 대회 선발 고사

import java.util.*;

class Solution {
    
    class Student {
        int rank, idx;
        boolean attendance;

        public Student(int rank, boolean attendance, int idx) {
            this.rank = rank;
            this.attendance = attendance;
            this.idx = idx;
        }
    }
    
    public int solution(int[] rank, boolean[] attendance) {
        Student[] students = new Student[rank.length];
        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(rank[i], attendance[i], i);
        }
        
        Arrays.sort(students, (a, b) -> { return a.rank - b.rank; });
        
        int[] topThree = new int[3];
        int cnt = 0;
        
        for (int i = 0; i < students.length; i++) {
            if (cnt == 3) break;
            
            if (students[i].attendance) {
                topThree[cnt++] = students[i].idx;
            }
        }
        
        int answer = (10000 * topThree[0]) + (100 * topThree[1]) + topThree[2];
        
        return answer;
    }
}