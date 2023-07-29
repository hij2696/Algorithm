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
    	
    	int X = Integer.parseInt(st.nextToken());
    	int N = Integer.parseInt(st.nextToken());
    	
    	if (N % 2 == 1 && N != 1) bw.write("ERROR");
    	else if ((X < 0 && N == 1) || (X > 0 && N == 0)) bw.write("INFINITE");
    	else if (X > 0 && N != 0 && N % 2 == 0) {
    		int ans = N / 2;
    		bw.write(String.valueOf(((X + ans - 1) / ans) - 1));
    	}
    	else bw.write("0");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}