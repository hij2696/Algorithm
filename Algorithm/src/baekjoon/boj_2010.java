import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int M = Integer.parseInt(br.readLine());
    	
    	int sum = 1, cnt = 0;
    	for (int i = 0; i < M; i++) {
    		int plug = Integer.parseInt(br.readLine());
    		
    		if (plug == 1) continue;
    		else if (plug >= 2) {
    			sum += plug;
    			cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(sum - cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}