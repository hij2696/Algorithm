import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static final int MAX_N = 1000;
	
	public static int N, cnt = 0;
	public static int[][] graph = new int[MAX_N + 1][MAX_N + 1];
	public static boolean[] node = new boolean[MAX_N + 1];
	
	public static void dfs(int idx) {
		if (node[idx]) return;
		
		node[idx] = true;
		for (int i = 1; i <= N; i++) {
			if (graph[idx][i] == 1) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int v1 = Integer.parseInt(st.nextToken());
    		int v2 = Integer.parseInt(st.nextToken());
    		
    		graph[v1][v2] = graph[v2][v1] = 1;
    	}
    	
    	for (int i = 1; i <= N; i++) {
    		if (!node[i]) {
    			dfs(i);
    			cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}