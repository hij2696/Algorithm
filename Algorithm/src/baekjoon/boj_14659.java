import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int ans = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] num = new int[N];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) num[i] = Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < num.length - 1; i++) {
    		int cnt = 0;
    		for (int j = i + 1; j < num.length; j++) {
    			if (num[i] > num[j]) cnt++;
    			else break;
    		}
    		ans = Math.max(ans, cnt);
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}