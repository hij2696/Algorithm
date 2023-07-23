import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int[] arr = new int[10];
    		for (int j = 0; j < 10; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		Arrays.sort(arr);
    		bw.write(String.valueOf(arr[7]) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}