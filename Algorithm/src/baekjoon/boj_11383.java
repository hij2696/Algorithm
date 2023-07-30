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
    	int M = Integer.parseInt(st.nextToken());
    	
		String[] shortStr = new String[N];
		String[] longStr = new String[N];
		
		for (int i = 0; i < N; i++) shortStr[i] = br.readLine();
		for (int i = 0; i < N; i++) longStr[i] = br.readLine();
		
		boolean chk = true;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2 * M; j++) {
				if (shortStr[i].charAt(j / 2) != longStr[i].charAt(j)) {
					chk = false;
					break;
				}
			}
		}
		
		if (chk) bw.write("Eyfa");
		else bw.write("Not Eyfa");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}