import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	br.close();
    	
    	for (int i = 2; i <= Math.sqrt(N); i++) {
    		while (N % i == 0) {
    			sb.append(i).append("\n");
    			N /= i;
    		}
    	}
    	
    	if (N != 1) sb.append(N);
    	
    	bw.write(String.valueOf(sb));
    	
    	bw.flush();
    	bw.close();
    }
}