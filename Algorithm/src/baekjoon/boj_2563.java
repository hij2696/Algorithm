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
    	
    	int N = Integer.parseInt(br.readLine());
    	int[][] paper = new int[100][100];
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int row = Integer.parseInt(st.nextToken());
    		int col = Integer.parseInt(st.nextToken());
    		
    		for (int j = row; j < row + 10; j++) {
    			for (int k = col; k < col + 10; k++) {
    				paper[j-1][k-1]++;
    			}
    		}
    	}
    	
    	int cnt = 0;
    	for (int i = 0; i < 100; i++) {
    		for (int j = 0; j < 100; j++) {
    			if (paper[i][j] > 0) cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}