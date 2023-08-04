import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void find (int x, int y) {
		int xEnd = x + 8;
		int yEnd = y + 8;
		int cnt = 0;
		
		boolean TF = arr[x][y];
		
		for (int i = x; i < xEnd; i++) {
			for (int j = y; j < yEnd; j++) {
				if (arr[i][j] != TF) cnt++;
				
				TF = !TF;
			}
			
			TF = !TF;
		}
		
		cnt = Math.min(cnt, 64 - cnt);
		
		min = Math.min(min, cnt);
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	arr = new boolean[N][M];
    	
    	for (int i = 0; i < N; i++) {
    		String str = br.readLine();
    		for (int j = 0; j < M; j++) {
    			if (str.charAt(j) == 'W') arr[i][j] = true;
    			else arr[i][j] = false;
    		}
    	}
    	
    	int nRow = N - 7;
    	int mCol = M - 7;
    	
    	for (int i = 0; i < nRow; i++) {
    		for (int j = 0; j < mCol; j++) {
    			find(i, j);
    		}
    	}
    	bw.write(String.valueOf(min));

    	bw.flush();
    	br.close();
    	bw.close();
    }
}