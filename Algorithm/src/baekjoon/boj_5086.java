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
    	
    	while (true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
    		int m = Integer.parseInt(st.nextToken());
    		
    		if (n == 0 && m == 0) break;
    		
    		if (m % n == 0) bw.write("factor" + "\n");
    		else if (n % m == 0) bw.write("multiple" + "\n");
    		else bw.write("neither" + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}