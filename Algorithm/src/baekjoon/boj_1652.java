import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	char[][] map = new char[101][101];
    	int horizontal = 0, vertical = 0;
    	
    	for (int i = 0; i < N; i++) {
    		String s = br.readLine();
    		for (int j = 0; j < N; j++) {
    			map[i][j] = s.charAt(j);
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		int checked_horizontal = 0, checked_vertical = 0;
    		for (int j = 0; j < N; j++) {
    			if (map[i][j] == '.') checked_horizontal++;
    			if (map[i][j] == 'X' || (j == N - 1)) {
    				if (checked_horizontal >= 2) horizontal++;
    				checked_horizontal = 0;
    			}
    			
    			if (map[j][i] == '.') checked_vertical++;
    			if (map[j][i] == 'X' || (j == N - 1)) {
    				if (checked_vertical >= 2) vertical++;
    				checked_vertical = 0;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(horizontal) + " " + String.valueOf(vertical));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}