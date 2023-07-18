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
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	
    	int L = Integer.parseInt(st1.nextToken());
    	int P = L * Integer.parseInt(st1.nextToken());
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	while (st2.hasMoreTokens()) {
    		int num = Integer.parseInt(st2.nextToken());
    		bw.write(String.valueOf(num - P)+ " ");
    		bw.flush();
    	}
    	br.close();
    	bw.close();
    }
}