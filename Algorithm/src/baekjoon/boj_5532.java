import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int L = Integer.parseInt(br.readLine());
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	int C = Integer.parseInt(br.readLine());
    	int D = Integer.parseInt(br.readLine());
    	
    	int cnt = 0;
    	while (true) {
    		if (A <= 0 && B <= 0) {
    			break;
    		}
    		A -= C;
    		B -= D;
    		cnt++;
    	}
    	
    	bw.write(String.valueOf(L - cnt));
    	bw.flush();
    	br.close();
    	bw.close();
    }
}