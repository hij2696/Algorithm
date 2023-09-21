import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int findNum(int n, int k) {
	    int cnt = 0;
	    boolean[] visit = new boolean[n + 1];

	    for (int i = 2; i <= n; i++) {
	        for (int j = i; j <= n; j += i) {
	            if (!visit[j]) {
	                cnt++;
	                visit[j] = true;
	            }

	            if (cnt == k) return j;
	        }
	    }

	    return -1;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	System.out.print(findNum(N, K));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}