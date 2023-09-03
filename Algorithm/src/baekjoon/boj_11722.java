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
    	StringTokenizer st = null;
    	
    	int A = Integer.parseInt(br.readLine());
    	int[] arr = new int[A];
    	int[] dp = new int[A];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < A; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	for (int i = A - 1; i >= 0; i--) {
    		dp[i] = 1;
    		for (int j = A - 1; j > i; j--) {
    			if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
    				dp[i] = dp[j] + 1;
    			}
    		}
    	}
    	
    	int max = 0;
    	for (int i = A - 1; i >= 0; i--) {
    		max = dp[i] > max ? dp[i] : max;
    	}
    	
    	bw.write(String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}