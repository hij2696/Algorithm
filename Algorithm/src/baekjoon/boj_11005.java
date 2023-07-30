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
    	int N = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while (N != 0) {
    		if (N % B < 10) sb.append(N % B);
    		else sb.append((char)((N % B) + 'A' - 10));
    		N /= B;
    	}
    	
    	bw.write(sb.reverse().toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}