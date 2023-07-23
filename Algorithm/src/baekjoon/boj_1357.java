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
    	String X = st.nextToken();
    	String Y = st.nextToken();
    	
    	StringBuilder sb1 = new StringBuilder(X);
    	StringBuilder sb2 = new StringBuilder(Y);
    	String ans_X = sb1.reverse().toString();
    	String ans_Y = sb2.reverse().toString();
    	
    	int Z = Integer.parseInt(ans_X) + Integer.parseInt(ans_Y);
    	String ans_Z = String.valueOf(Z);
    	
    	StringBuilder sb3 = new StringBuilder(ans_Z);
    	String ans = sb3.reverse().toString();
    	int answer = Integer.parseInt(ans);
    	
    	
    	bw.write(String.valueOf(answer));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}