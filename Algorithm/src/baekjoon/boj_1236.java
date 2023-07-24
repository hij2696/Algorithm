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
    	
    	int row = 0, col = 0;
    	char[][] castle = new char[N][M];
    	
    	for (int i = 0; i < N; i++) {
    		String str = br.readLine();
    		for (int j = 0; j < M; j++) {
    			castle[i][j] = str.charAt(j);
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		boolean checked = true;
    		for (int j = 0; j < M; j++) {
    			if (castle[i][j] == 'X') {
    				checked = false;
    				break;
    			}
    		}
    		if (checked) row++;
    	}
    	
    	for (int i = 0; i < M; i++) {
    		boolean checked = true;
    		for (int j = 0; j < N; j++) {
    			if (castle[j][i] == 'X') {
    				checked = false;
    				break;
    			}
    		}
    		if (checked) col++;
    	}
    	
    	bw.write(String.valueOf(Math.max(row, col)));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}