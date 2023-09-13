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
    	StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
    	
    	int sum = Integer.MAX_VALUE;
    	
    	while(sub.hasMoreTokens()) {
    		int tmp = 0;
    		
    		StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
    		
    		while (add.hasMoreTokens()) {
    			tmp += Integer.parseInt(add.nextToken());
    		}
    		
    		if (sum == Integer.MAX_VALUE) sum = tmp;
    		else sum -= tmp;
    	}
    	
    	bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}