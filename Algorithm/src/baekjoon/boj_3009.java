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
    	
    	int[][] arr = new int[3][2];
    	
    	for (int i = 0; i < 3; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < 2; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	if (arr[0][0] == arr[1][0]) bw.write(String.valueOf(arr[2][0]) + " ");
    	else if (arr[0][0] == arr[2][0]) bw.write(String.valueOf(arr[1][0]) + " ");
    	else bw.write(String.valueOf(arr[0][0]) + " ");
    	
    	if (arr[0][1] == arr[1][1]) bw.write(String.valueOf(arr[2][1]));
    	else if (arr[0][1] == arr[2][1]) bw.write(String.valueOf(arr[1][1]));
    	else bw.write(String.valueOf(arr[0][1]));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}