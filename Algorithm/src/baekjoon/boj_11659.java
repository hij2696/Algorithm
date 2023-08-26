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
    	int M = Integer.parseInt(st.nextToken());
    	int[] arr = new int[N + 1];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 1; i <= N; i++) arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		bw.write(String.valueOf(arr[y] - arr[x - 1]) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}