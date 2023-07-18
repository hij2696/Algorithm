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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	int[] num = new int[N + 1];
    	int cnt = 0;
    	
    	for (int i = 1; i <= N; i++) {
    		if (N % i == 0) {
    			num[i] = i;
    			cnt++;
    		}
    		if (cnt == K) {
    			bw.write(String.valueOf(num[i]));
    			break;
    		}
    	}
    	
    	if (cnt < K) bw.write("0");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}