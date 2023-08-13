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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		if (a > c) {
			int tmp = a;
			a = c;
			c = tmp;
		}
		
		if (b > c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		
		if (a + b > c) bw.write(String.valueOf(a + b + c));
		else bw.write(String.valueOf((a + b) * 2 - 1));
		
		bw.flush();
		br.close();
		bw.close();
	}
}