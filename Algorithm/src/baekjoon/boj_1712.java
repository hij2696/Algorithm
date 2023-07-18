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
    	
    	long A = Long.parseLong(st.nextToken());
    	long B = Long.parseLong(st.nextToken());
    	long C = Long.parseLong(st.nextToken());
    	
    	if (B >= C) {
    		bw.write("-1");
    	}
    	else {
    		long cost_A = A;
        	long cost_B = 0;
        	int cnt = 0;
        	
        	while (true) {
        		cost_A += B;
        		cost_B += C;
        		cnt++;
        		
        		if (cost_A < cost_B) {
        			break;
        		}
        	}
        	bw.write(String.valueOf(cnt));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}