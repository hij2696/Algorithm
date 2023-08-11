import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student {
	String name;
	int day, month, year;
	
	public Student(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Student[] student = new Student[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			
			student[i] = new Student(name, day, month, year);
		}
		
		Arrays.sort(student, (a, b) -> {
			if (a.year != b.year) return b.year - a.year;
			if (a.month != b.month) return b.month - a.month;
			return b.day - a.day;
		});
		
		bw.write(student[0].name + "\n" + student[n-1].name);
		
		bw.flush();
		br.close();
		bw.close();
	}
}