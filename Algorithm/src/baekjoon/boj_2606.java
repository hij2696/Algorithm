import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static final int MAX_N = 100;
	
	public static int N, M;
	public static int[][] graph = new int[MAX_N + 1][MAX_N + 1];
	public static boolean[] visited = new boolean[MAX_N + 1];
	public static int vertexCnt = 0;
	
	public static void dfs(int vertex) {
		for (int currV = 1; currV <= N; currV++) {
			if (graph[vertex][currV] == 1 && !visited[currV]) {
				visited[currV] = true;
				vertexCnt++;
				dfs(currV);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	N = Integer.parseInt(br.readLine());
    	M = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int v1 = Integer.parseInt(st.nextToken());
    		int v2 = Integer.parseInt(st.nextToken());
    		
    		graph[v1][v2] = graph[v2][v1] = 1;
    	}
    	
    	visited[1] = true;
    	dfs(1);
    	
    	bw.write(String.valueOf(vertexCnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}