import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int n = (N % 2 == 0) ? N / 2 : (N + 1) / 2;
		int cnt = 1, sum = 0, checked = 1, num = 1;
		
		while (checked < n) {
			if (sum == N) {
				sum = 0;
				cnt++;
				checked++;
				num = checked;
			}
			else if (sum < N) {
				sum += num;
				num++;
			}
			else if (sum > N) {
				sum = 0;
				checked++;
				num = checked;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		br.close();
		bw.close();
	}
}