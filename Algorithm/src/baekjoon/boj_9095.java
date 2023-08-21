import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	
	public static final int MAX_N = 11;	
	public static int[] dp = new int[MAX_N];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 4; i <= 10; i++) dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        
        for (int i = 0; i < T; i++) {
        	int num = Integer.parseInt(br.readLine());
        	sb.append(dp[num]).append("\n");
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}