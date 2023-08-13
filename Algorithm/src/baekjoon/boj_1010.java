import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] dp = new int[30][30];
	
	public static int BC(int n, int r) {
		if (dp[n][r] > 0) return dp[n][r];
		
		if (n == r || r == 0) return dp[n][r] = 1;
		
		return dp[n][r] = BC(n - 1, r - 1) + BC(n - 1, r);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(BC(M, N) + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}