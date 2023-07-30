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
    		int N = Integer.parseInt(br.readLine());
    		String[] university = new String[N];
    		int max = Integer.MIN_VALUE, idx = 0;
    		
    		for (int j = 0; j < N; j++) {
    			String s = br.readLine();
    			String[] str = s.split(" ");
    			
    			university[j] = str[0];
    			int L = Integer.parseInt(str[1]);
    			
    			if (max < L) {
    				max = L;
    				idx = j;
    			}
    		}
    		
    		bw.write(university[idx] + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}