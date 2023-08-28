import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	st = new StringTokenizer(br.readLine());
    	int firstRing = Integer.parseInt(st.nextToken());
    	for (int i = 0; i < N - 1; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		int gcd = gcd(firstRing, num);
    		
    		sb.append(firstRing / gcd).append('/').append(num / gcd).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}