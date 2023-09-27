import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static long koong(int N) {
		if (N < 2) return 1;
		else if (N == 2) return 2;
		else if (N == 3) return 4;
		else {
			long[] dp = new long[N + 1];
			dp[0] = dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			for (int i = 4; i <= N; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
			}
			return dp[N];
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		System.out.println(koong(Integer.parseInt(br.readLine())));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}