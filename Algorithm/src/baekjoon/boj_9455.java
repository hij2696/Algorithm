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
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int m = Integer.parseInt(st.nextToken());
    		int n = Integer.parseInt(st.nextToken());
    		
    		int[][] grid = new int[m][n];
    		for (int j = 0; j < m; j++) {
    			st = new StringTokenizer(br.readLine());
    			for (int k = 0; k < n; k++) {
    				grid[j][k] = Integer.parseInt(st.nextToken());
    			}
    		}
    		
    		int ans = 0;
    		
    		for (int j = 0; j < n; j++) {
    			for (int k = 0; k < m; k++) {
    				if (grid[k][j] == 1) {
    					for (int l = k + 1; l < m; l++) {
    						if (grid[l][j] == 0) ans++;
    					}
    				}
    			}
    		}
    		
    		bw.write(String.valueOf(ans) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}