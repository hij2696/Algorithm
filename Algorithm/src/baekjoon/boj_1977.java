import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int M = Integer.parseInt(br.readLine());
    	int N = Integer.parseInt(br.readLine());
    	
    	int sum = 0, min = 0;
    	
    	for (int i = M; i <= N; i++) {
    		if (Math.ceil(Math.sqrt(i)) == Math.floor(Math.sqrt(i))) {
    			sum += i;
    			if (sum == i) min = i;
    		}
    	}
    	
    	if (sum != 0) bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
    	else bw.write("-1");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}