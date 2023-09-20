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
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	int[] arr = new int[N];
    	int[] order = new int[N];
    	boolean[] visited = new boolean[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < N; i++) {
    		int min = Integer.MAX_VALUE;
    		int minIdx = -1;
    		
    		for (int j = 0; j < N; j++) {
    			if (visited[j]) continue;
    			
    			if (min > arr[j]) {
    				min = arr[j];
    				minIdx = j;
    			}
    		}
    		order[minIdx] = i;
    		visited[minIdx] = true;
    	}
    	
    	for (int i = 0; i < N; i++) bw.write(order[i] + " ");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}