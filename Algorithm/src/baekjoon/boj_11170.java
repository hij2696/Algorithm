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
    	StringTokenizer st;
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		st = new StringTokenizer(br.readLine());
    		int N = Integer.parseInt(st.nextToken());
    		int M = Integer.parseInt(st.nextToken());
    		int sum = 0;
    		
    		for (int j = N; j <= M; j++) {
    			String str = String.valueOf(j);
    			for (int k = 0; k < str.length(); k++) {
    				if (str.charAt(k) == '0') {
    					sum++;
    				}
    			}
    		}
    		
    		bw.write(String.valueOf(sum) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}