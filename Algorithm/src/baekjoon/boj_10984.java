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
    		int N = Integer.parseInt(br.readLine());
    		int sum1 = 0;
    		float sum2 = 0;
    		for (int j = 0; j < N; j++) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			int C = Integer.parseInt(st.nextToken());
    			float G = Float.parseFloat(st.nextToken());
    			sum1 += C;
    			sum2 += C * G;
    		}
    		String ans = String.format("%.1f", sum2 / sum1);
    		bw.write(String.valueOf(sum1) + " " + String.valueOf(ans) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}