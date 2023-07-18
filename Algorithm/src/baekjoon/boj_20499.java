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
    	StringTokenizer st = new StringTokenizer(br.readLine(), "/");
    	
    	int K = Integer.parseInt(st.nextToken());
    	int D = Integer.parseInt(st.nextToken());
    	int A = Integer.parseInt(st.nextToken());
    	
    	if (D == 0 || K + A < D) bw.write("hasu");
    	else bw.write("gosu");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}