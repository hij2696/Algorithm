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
    	
    	int num = 1;
    	while (true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int L = Integer.parseInt(st.nextToken());
    		int P = Integer.parseInt(st.nextToken());
    		int V = Integer.parseInt(st.nextToken());
    		
    		int sum = 0;
    		if (L == 0 && P == 0 && V == 0) break;
    		
    		for (int i = 0; i < V / P; i++) sum += L;
    		
    		if ((V % P) <= L) sum += V % P;
    		else sum += L;
    		
    		bw.write("Case " + String.valueOf(num) + ": " + String.valueOf(sum) + "\n");
    		num++;
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}