import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int fibCnt = 0;
	public static int dpCnt = 0;
	public static int[] dp;
	
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			fibCnt++;
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static int fibonacci(int n) {
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i < n; i++) {
			dpCnt++;
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n - 1];
	}

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	dp = new int[n];
    	
    	fib(n);
    	fibonacci(n);
    	
    	bw.write(String.valueOf(fibCnt) + " " + String.valueOf(dpCnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}