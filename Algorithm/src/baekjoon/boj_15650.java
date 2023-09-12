import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int N, int M, int curr, int depth) {
		if (depth == M) {
			for (int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append("\n");
			return;
		}
		
		for (int i = curr; i <= N; i++) {
			arr[depth] = i;
			dfs(N, M, i + 1, depth + 1);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	arr = new int[M];
    	
    	dfs(N, M, 1, 0);
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}