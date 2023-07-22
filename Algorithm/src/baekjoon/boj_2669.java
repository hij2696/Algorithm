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
    	
    	int[][] cnt = new int[101][101];
    	
    	for (int i = 0; i < 4; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int x1 = Integer.parseInt(st.nextToken());
    		int y1 = Integer.parseInt(st.nextToken());
    		int x2 = Integer.parseInt(st.nextToken());
    		int y2 = Integer.parseInt(st.nextToken());
    		
    		for (int j = x1; j < x2; j++) {
    			for (int k = y1; k < y2; k++) {
    				if (cnt[j][k] == 0) {
    					cnt[j][k]++;
    				}
    			}
    		}
    		
    	}
    	
    	int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (cnt[i][j] > 0) {
					sum++;
				}
			}
		}
		
		bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}