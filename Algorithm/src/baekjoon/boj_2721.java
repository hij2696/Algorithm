import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		int n = Integer.parseInt(br.readLine());
    		int ans = 0, sum = 1;
    		
    		for (int j = 1; j <= n; j++) {
    			sum += j + 1;
    			ans += j * sum;
    		}
    		
    		bw.write(String.valueOf(ans) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}