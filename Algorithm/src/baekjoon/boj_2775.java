import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		int k = Integer.parseInt(br.readLine());
    		int n = Integer.parseInt(br.readLine());
    		
    		int[][] arr2d = new int[k + 1][n];
    		
    		for (int j = 0; j < n; j++) arr2d[0][j] = j + 1;
    		
    		for (int j = 1; j < k + 1; j++) {
    			for (int l = 0; l < n; l++) {
    				for (int m = 0; m <= l; m++) {
    					arr2d[j][l] += arr2d[j-1][m];
    				}
    			}
    		}
    		
    		bw.write(String.valueOf(arr2d[k][n - 1]) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}