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
    	
    	String A = st.nextToken();
    	String B = st.nextToken();
    	
    	String maxA = "", maxB = "", minA = "", minB = "";
    	
    	for (int i = 0; i < A.length(); i++) {
    		if (A.charAt(i) == '5' || A.charAt(i) == '6') {
    			minA += 5;
    			maxA += 6;
    		}
    		else {
    			minA += A.charAt(i);
    			maxA += A.charAt(i);
    		}
    	}
    	
    	for (int i = 0; i < B.length(); i++) {
    		if (B.charAt(i) == '5' || B.charAt(i) == '6') {
    			minB += 5;
    			maxB += 6;
    		}
    		else {
    			minB += B.charAt(i);
    			maxB += B.charAt(i);
    		}
    	}
    	
    	bw.write(String.valueOf(Integer.parseInt(minA) + Integer.parseInt(minB)) + " " + String.valueOf(Integer.parseInt(maxA) + Integer.parseInt(maxB)));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}