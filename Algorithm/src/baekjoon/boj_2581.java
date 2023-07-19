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
    		
    		int cnt = 0;
    		
    		if (i == 2) {
    			sum += i;
    			min = i;
    			continue;
    		}
    		
    		else if (i == 1 || i % 2 == 0) continue;
    		
    		for (int j = 2; j < i; j++) {
    			
    			if (i % j == 0) {
    				cnt++;
    				break;
    			}
    		}
    		
    		if (cnt == 1) continue;
    		else  {
    			sum += i;
    			if (sum == i) min = i;
    		}
    	}
    	
    	if (sum == 0) bw.write("-1");
    	else bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}