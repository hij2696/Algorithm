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
    	
    	int S = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	int H = Integer.parseInt(st.nextToken());
    	
    	if (S + K + H >= 100) bw.write("OK");
    	else {
    		if (S < K && S < H) {
    			bw.write("Soongsil");
    		}
    		else if (K < H && K < S) {
    			bw.write("Korea");
    		}
    		else if (H < S && H < K) {
    			bw.write("Hanyang");
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}