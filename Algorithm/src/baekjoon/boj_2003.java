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
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int start = 0, end = 0, sum = 0, ans = 0;
		
		for (int i = start; i <= end; i++) sum += arr[i];
		
		while (true) {
			try {
				if (sum == M) {
					ans++;
					sum += arr[++end] - arr[start++];
				}
				else if (sum < M) sum += arr[++end];
				else sum -= arr[start++];
			}
			catch (Exception e) {
				break;
			}
		}
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		br.close();
		bw.close();
	}
}