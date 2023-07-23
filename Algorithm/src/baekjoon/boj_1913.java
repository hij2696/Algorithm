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
    	int num = Integer.parseInt(br.readLine());
    	
    	int[][] arr = new int[N][N];
    	int num_x = 0, num_y = 0, cnt = 1;
    	int x = N / 2, y = N / 2;
    	
    	int limit = 1;
    	while (true) {
    		for (int i = 0; i < limit; i++) arr[y--][x] = cnt++;
    		if (cnt - 1 == Math.pow(N, 2)) break;
    		for (int i = 0; i < limit; i++) arr[y][x++] = cnt++;
    		limit++;
    		for (int i = 0; i < limit; i++) arr[y++][x] = cnt++;
    		for (int i = 0; i < limit; i++) arr[y][x--] = cnt++;
    		limit++;
    	}
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < N; j++) {
    			bw.write(String.valueOf(arr[i][j]) + " ");
    			if (num == arr[i][j]) {
    				num_x = i + 1;
    				num_y = j + 1;
    			}
    		}
    		bw.write("\n");
    	}
    	
    	bw.write(String.valueOf(num_x) + " " + String.valueOf(num_y));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}