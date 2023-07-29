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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	int[][] map = new int[N][M];
    	int max = 256;
    	int min = 0;
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < M; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    			if (min > map[i][j]) min = map[i][j];
    			if (max < map[i][j]) max = map[i][j];
    		}
    	}
    	
    	int time = Integer.MAX_VALUE;
    	int height = 0;
    	
    	for (int i = min; i <= max; i++) {
    		int cnt = 0;
    		int block = B;
    		
    		for (int j = 0; j < N; j++) {
    			for (int k = 0; k < M; k++) {
    				if (i < map[j][k]) {
    					cnt += (map[j][k] - i) * 2;
    					block += map[j][k] - i;
    				}
    				else {
    					cnt += i - map[j][k];
    					block -= i - map[j][k];
    				}
    			}
    		}
    		
    		if (block < 0) break;
    		
    		if (time >= cnt) {
    			time = cnt;
    			height = i;
    		}
    	}
    	
    	bw.write(String.valueOf(time) + " " + String.valueOf(height));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}