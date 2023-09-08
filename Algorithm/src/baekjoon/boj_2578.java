import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static final int NUM = 5;
	
	public static int[][] board;
	public static int cnt;
	public static int turn = 1;
	
	public static void row() {
		for (int i = 0; i < NUM; i++) {
			int rowCnt = 0;
			
			for (int j = 0; j < NUM; j++) {
				if (board[i][j] == 0) rowCnt++;
				if (rowCnt == 5) cnt++;
			}
		}
	}
	
	public static void col() {
		for (int i = 0; i < NUM; i++) {
			int colCnt = 0;
			
			for (int j = 0; j < NUM; j++) {
				if (board[j][i] == 0) colCnt++;
				if (colCnt == 5) cnt++;
			}
		}
	}
	
	public static void diag1() {
		int diag1Cnt = 0;
		
		for (int i = 0; i < NUM; i++) {
			if (board[i][i] == 0) diag1Cnt++;
			if (diag1Cnt == 5) cnt++;
		}
	}
	
	public static void diag2() {
		int diag2Cnt = 0;
		
		for (int i = 0; i < NUM; i++) {
			if (board[i][NUM - i - 1] == 0) diag2Cnt++;
			if (diag2Cnt == 5) cnt++;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	board = new int[NUM][NUM];
    	
    	for (int i = 0; i < NUM; i++) {
    		st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < NUM; j++) {
    			board[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	for (int i = 0; i < NUM; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for (int j = 0; j < NUM; j++) {
    			int num = Integer.parseInt(st.nextToken());
    			
    			for (int k = 0; k < NUM; k++) {
    				for (int l = 0; l < NUM; l++) {
    					if (board[k][l] == num) {
    						board[k][l] = 0;
    					}
    				}
    			}
    			
    			col();
    			row();
    			diag1();
    			diag2();
    			
    			if (cnt >= 3) {
    				System.out.println(turn);
    				System.exit(0);
    			}
    			cnt = 0;
    			turn++;
    		}
    	}
    	
    	br.close();
    }
}