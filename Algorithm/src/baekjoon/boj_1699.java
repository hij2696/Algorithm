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
    	int[] arr = new int[N + 1];
    	
    	for (int i = 1; i <= N; i++) {
    		arr[i] = i;
    		for (int j = 1; j * j <= i; j++) {
    			if (arr[i] > arr[i - j * j] + 1) {
    				arr[i] = arr[i - j * j] + 1;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(arr[N]));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}