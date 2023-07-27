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
    	int N = Integer.parseInt(st1.nextToken());
    	int M = Integer.parseInt(st1.nextToken());
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	long ans = 1;
    	for (int i = 0; i < N; i++) {
    		int num = Integer.parseInt(st2.nextToken());
    		
    		if (num * ans > Math.pow(2, 31) - 1) ans = (ans % M) * (num % M) % M;
    		else ans = (ans * num) % M;
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}