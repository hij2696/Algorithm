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
    	int M1 = Integer.parseInt(st1.nextToken());
    	
    	int[][] A = new int[N][M1];
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		for (int j = 0; j < M1; j++) {
    			A[i][j] = Integer.parseInt(st2.nextToken());
    		}
    	}
    	
    	StringTokenizer st3 = new StringTokenizer(br.readLine());
    	int M2 = Integer.parseInt(st3.nextToken());
    	int K = Integer.parseInt(st3.nextToken());
    	
    	int[][] B = new int[M2][K];
    	for (int i = 0; i < M2; i++) {
    		StringTokenizer st4 = new StringTokenizer(br.readLine());
    		for (int j = 0; j < K; j++) {
    			B[i][j] = Integer.parseInt(st4.nextToken());
    		}
    	}
    	
    	int[][] ans = new int[N][K];
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < K; j++) {
    			for (int l = 0; l < M1; l++) {
    				ans[i][j] += A[i][l] * B[l][j];
    			}
    			bw.write(String.valueOf(ans[i][j]) + " ");
    		}
    		bw.write("\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}