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
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		int C = Integer.parseInt(st.nextToken());
    		int D = Integer.parseInt(st.nextToken());
    		int E = Integer.parseInt(st.nextToken());
    		
    		double sum = (350.34 * A) + (230.90 * B) + (190.55 * C) + (125.30 * D) + (180.90 * E);
    		bw.write("$" + String.format("%.2f", sum) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}