import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] persons = new int[N][2];
		
		for (int i = 0; i < persons.length; i++) {
			st = new StringTokenizer(br.readLine());
			persons[i][0] = Integer.parseInt(st.nextToken());
			persons[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < persons.length; i++) {
			int rank = 1;
			
			for (int j = 0; j < persons.length; j++) {
				if (i == j) continue;
				if (persons[i][0] < persons[j][0] && persons[i][1] < persons[j][1]) {
					rank++;
				}
			}
			
			bw.write(String.valueOf(rank) + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}