import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static final int NUM = 100;
	
	public static long[] seq = new long[NUM + 1];
	
	public static void padovan() {
		seq[1] = seq[2] = seq[3] = 1;
		
		for (int i = 4; i <= 100; i++) seq[i] = seq[i- 2] + seq[i - 3];
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	padovan();
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) sb.append(seq[Integer.parseInt(br.readLine())]).append("\n");
    	
    	bw.write(sb.toString());

    	bw.flush();
    	br.close();
    	bw.close();
    }
}