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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int L = Integer.parseInt(st.nextToken());
    	int R = Integer.parseInt(st.nextToken());
    	int A = Integer.parseInt(st.nextToken());
    	
    	
    	while (true) {
    		if (A == 0) {
    			while (true) {
    				if (L == R) break;
    				
    				if (L > R) L--;
    				else R--;
    			}
    			break;
    		}
    		
    		if (L <= R) {
    			L++;
    			A--;
    		}
    		else {
    			R++;
    			A--;
    		}
    	}
    	
    	bw.write(String.valueOf(L + R));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}