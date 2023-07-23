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
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st1.nextToken());
    	int M = Integer.parseInt(st1.nextToken());
    	
    	int[][] num = new int[N][M];
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		for (int j = 0; j < M; j++) {
    			num[i][j] = Integer.parseInt(st2.nextToken());
    		}
    	}
    	
    	int K = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < K; i++) {
    		StringTokenizer st3 = new StringTokenizer(br.readLine());
    		int sum = 0;
    		int x1 = Integer.parseInt(st3.nextToken()) - 1;
    		int x2 = Integer.parseInt(st3.nextToken()) - 1;
    		int y1 = Integer.parseInt(st3.nextToken()) - 1;
    		int y2 = Integer.parseInt(st3.nextToken()) - 1;
    		
    		for (int j = x1; j <= y1; j++) {
    			for (int k = x2; k <= y2; k++) {
    				sum += num[j][k];
    			}
    		}
    		
    		bw.write(String.valueOf(sum) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}