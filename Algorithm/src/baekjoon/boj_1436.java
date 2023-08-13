import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int num = 666;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		
		while (cnt != N) {
			String s = Integer.toString(num);
			if (s.contains("666")) cnt++;
			num++;
			
			if (cnt == N) sb.append(s); 
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}