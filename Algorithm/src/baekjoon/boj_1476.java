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
    	
    	int E = Integer.parseInt(st.nextToken());
    	int S = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int cnt = 1;
    	
    	while (true) {
    		if (E == 1 && S == 1 && M == 1) break;
    		
    		E--; S--; M--; cnt++;
    		
    		if (E == 0) E = 15;
    		if (S == 0) S = 28;
    		if (M == 0) M = 19;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}