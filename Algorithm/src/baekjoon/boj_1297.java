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
    	int D = Integer.parseInt(st.nextToken());
    	int H = Integer.parseInt(st.nextToken());
    	int W = Integer.parseInt(st.nextToken());
    	
    	double num = (Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));
    	
    	bw.write(String.valueOf((int)Math.sqrt(num * Math.pow(H, 2))) + " " + String.valueOf((int)Math.sqrt(num * Math.pow(W, 2))));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}