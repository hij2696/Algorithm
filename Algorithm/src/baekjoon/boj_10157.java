import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] dx = new int[]{-1, 0, 1, 0};
	public static int[] dy = new int[]{0, 1, 0, -1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int C = Integer.parseInt(st.nextToken());
    	int R = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(br.readLine());
    	
    	int[][] arr = new int[R + 2][C + 2];
    	
    	for (int i = 0; i < (C + 2); i++) arr[0][i] = arr[R + 1][i] = -1;
    	
    	for (int i = 0; i < (R + 2); i++) arr[i][0] = arr[i][C + 1] = -1;
    	
    	if (K > C * R) {
    		System.out.print(0);
    		System.exit(0);
    	}
    	
    	int x = R, y = 1, cnt = 1, dirNum = 0;
    	
    	while (true) {
    		arr[x][y] = cnt;
    		
    		if (cnt == K) {
    			System.out.print(y + " " + (R - x + 1));
    			break;
    		}
    		
    		if (arr[x + dx[dirNum]][y + dy[dirNum]] != 0) {
    			dirNum = (dirNum + 1) % 4;
    		}
    		
    		x += dx[dirNum]; y += dy[dirNum];
    		cnt++;
    		
    		if (cnt > C * R) break;
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}