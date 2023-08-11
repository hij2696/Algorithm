import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'X') cnt++;
			else if (s.charAt(i) == '.') {
				while (cnt != 0) {
					if (cnt % 2 == 1) {
						cnt = -1;
						break;
					}
					else if (cnt - 4 >= 0) {
						sb.append("AAAA");
						cnt -= 4;
					}
					else if (cnt - 2 >= 0) {
						sb.append("BB");
						cnt -= 2;
					}
				}
				sb.append(".");
				
				if (cnt == -1) break;
			}
		}
		
		if (cnt > 0) {
			while (cnt != 0) {
				if (cnt % 2 == 1) {
					cnt = -1;
					break;
				}
				else if (cnt - 4 >= 0) {
					sb.append("AAAA");
					cnt -= 4;
				}
				else if (cnt - 2 >= 0) {
					sb.append("BB");
					cnt -= 2;
				}
			}
		}
		
		if (cnt == -1) bw.write("-1");
		else bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}