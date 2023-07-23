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
    	int[][] arr2d = new int[N][N];
    	int[] row = new int[N];
    	int[] column = new int[N];
    	int diagonal_1 = 0, diagonal_2 = 0;
    	int[] cnt = new int[(N * N) + 1];
    	int square = N * (N * N + 1) / 2;
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < N; j++) {
    			arr2d[i][j] = Integer.parseInt(st.nextToken());
    			
    			cnt[arr2d[i][j]]++;
    			row[i] += arr2d[i][j];
    			column[j] += arr2d[i][j];
    			if (i == j) diagonal_1 += arr2d[i][j];
    			if (i + j == N - 1) diagonal_2 += arr2d[i][j];
    		}
    	}
    	
    	boolean checked1 = true;
    	boolean checked2 = true;
    	boolean checked3 = true;
    	
    	for (int i = 1; i < cnt.length; i++) {
    		if (cnt[i] != 1) checked1 = false;
    	}
    	
    	if (diagonal_1 != square || diagonal_2 != square) checked2 = false;
    	
    	for (int i = 0; i < N; i++) {
    		if (row[i] != square || column[i] != square) checked3 = false;
    	}
    	
    	if (checked1 && checked2 && checked3) bw.write("TRUE");
    	else bw.write("FALSE");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}