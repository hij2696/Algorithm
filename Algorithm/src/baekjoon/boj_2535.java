import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student {
	int nation, num, score;
	
	public Student(int nation, int num, int score) {
		this.nation = nation;
		this.num = num;
		this.score = score;
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Student[] students = new Student[N];
		int[] idx = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int nation = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			
			students[i] = new Student(nation, num, score); 
		}
		
		Arrays.sort(students, (a, b) -> {
			return b.score - a.score;
		});
		
		
		int cnt = 0;
		int[][] answer = new int[3][2];
		for (int i = 0; i < N; i++) {
			idx[students[i].nation]++;
			
			if (idx[students[i].nation] > 2) continue;
			else {
				answer[cnt][0] = students[i].nation;
				answer[cnt][1] = students[i].num;
				cnt++;
				if (cnt == 3) break;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			bw.write(answer[i][0] + " " + answer[i][1] + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}