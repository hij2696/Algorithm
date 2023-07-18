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
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] ans = new int[N];
    	
    	int cnt = 0, sum = 0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) {
    		ans[i] = Integer.parseInt(st.nextToken());
    		
    		if (ans[i] == 0) cnt = 0;
    		else if (ans[i] == 1) {
    			if (cnt > 0) sum += ++cnt;
    			else {
    				sum += 1;
    				cnt++;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}