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
    	int K = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[N + 1];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	int sum = 0;
    	for (int i = 1; i <= K; i++) sum += arr[i];
    	
    	int max = sum;
    	for (int i = K + 1, j = 1; i <= N; i++, j++) {
    		sum += arr[i] - arr[j];
    		max = Math.max(sum, max);
    	}
    	
    	bw.write(String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}