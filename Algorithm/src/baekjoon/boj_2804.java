import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int NUM = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	String A = st.nextToken();
    	String B = st.nextToken();
    	
    	int N = A.length(), M = B.length();
    	int idx1 = NUM, idx2 = NUM;
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < M; j++) {
    			if (A.charAt(i) == B.charAt(j)) {
    				idx1 = i;
    				idx2 = j;
    				break;
    			}
    		}
    		if (idx1 != NUM && idx2 != NUM) break;
    	}
    	
    	for (int i = 0; i < M; i++) {
    		for (int j = 0; j < N; j++) {
    			if (i == idx2) bw.write(A.charAt(j));
    			else if (j == idx1) bw.write(String.valueOf(B.charAt(i)));
    			else bw.write(".");
    		}
    		bw.newLine();
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}