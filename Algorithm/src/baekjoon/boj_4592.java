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
    	
    	while (true) {
    		st = new StringTokenizer(br.readLine());
    		int N = Integer.parseInt(st.nextToken());
        	
        	if (N == 0) break;
        	
        	int[] num = new int[N];
        	for (int i = 0; i < N; i++) num[i] = Integer.parseInt(st.nextToken());
        	
        	bw.write(String.valueOf(num[0]) + " ");
        	
        	for (int i = 1; i < N; i++) {
        		if (num[i] != num[i - 1]) {
        			bw.write(String.valueOf(num[i]) + " ");
        		}
        	}
        	
        	bw.write("$\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}