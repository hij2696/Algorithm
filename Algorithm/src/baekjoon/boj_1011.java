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
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance);
			
			if (max == Math.sqrt(distance)) bw.write(String.valueOf(2 * max - 1) + "\n");
			else if (distance <= max * max + max) bw.write(String.valueOf(2 * max) + "\n");
			else bw.write(String.valueOf(2 * max + 1) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}