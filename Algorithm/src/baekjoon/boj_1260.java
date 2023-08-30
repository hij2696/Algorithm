import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static final int MAX_N = 1000;
	public static final int MAX_M = 10000;
	public static int N, M, V;
	
	public static int[][] dfsGraph = new int[MAX_N + 1][MAX_N + 1];
	public static int[][] bfsGraph = new int[MAX_N + 1][MAX_N + 1];
	public static boolean[] dVisited = new boolean[MAX_M + 1];
	public static boolean[] bVisited = new boolean[MAX_M + 1];
	
	public static void dfs(int vertex) {
		dVisited[vertex] = true;
		System.out.print(vertex + " ");
		
		for (int i = 1; i <= N; i++) {
			if (dfsGraph[vertex][i] == 1 && !dVisited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int vertex) {
		Queue<Integer> queue = new LinkedList<Integer>();
		bVisited[vertex] = true;
		queue.offer(vertex);
		
		while (!queue.isEmpty()) {
			int P = queue.poll();
			System.out.print(P + " ");
			
			for (int i = 1; i <= N; i++) {
				if (bfsGraph[P][i] == 1 && !bVisited[i]) {
					bVisited[i] = true;
					queue.offer(i);
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	V = Integer.parseInt(st.nextToken());
    	
    	while (M-- > 0) {
    		st = new StringTokenizer(br.readLine());
    		int v1 = Integer.parseInt(st.nextToken());
    		int v2 = Integer.parseInt(st.nextToken());
    		
    		dfsGraph[v1][v2] = dfsGraph[v2][v1] = 1;
    		bfsGraph[v1][v2] = bfsGraph[v2][v1] = 1;
    	}
    	
    	br.close();
    	
    	dfs(V);
    	System.out.println();
    	bfs(V);
    }
}