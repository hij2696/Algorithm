import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int money = Integer.parseInt(br.readLine());
    	int n = 1000 - money;
    	int cnt = 0;
    	
    	while (true) {
    		if (n == 0) break;
    		if (n >= 500)  {
    			cnt++;
    			n -= 500;
    		}
    		else if (n >= 100) {
    			cnt++;
    			n -= 100;
    		}
    		else if (n >= 50) {
    			cnt++;
    			n -= 50;
    		}
    		else if (n >= 10) {
    			cnt++;
    			n -= 10;
    		}
    		else if (n >= 5) {
    			cnt++;
    			n -= 5;
    		}
    		else if (n >= 1) {
    			cnt++;
    			n -= 1;
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}