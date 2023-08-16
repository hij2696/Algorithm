import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student {
	String name;
	int kor, eng, math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Student[] students = new Student[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			students[i] = new Student(name, kor, eng, math);
		}
		
		Arrays.sort(students, (a, b) -> {
			if (a.kor != b.kor) return b.kor - a.kor;
			else if (a.eng != b.eng) return a.eng - b.eng;
			else if (a.math != b.math) return b.math - a.math;
			return a.name.compareTo(b.name);
		});
		
		StringBuilder sb = new StringBuilder();
		for (Student s : students) sb.append(s.name).append("\n");
		
			
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}