import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	while (true) {
    		int num = Integer.parseInt(br.readLine());
    		if (num == 0) break;
    		
    		if (num % n != 0) bw.write(String.valueOf(num) + " is NOT a multiple of " + String.valueOf(n) + ".\n");
    		else bw.write(String.valueOf(num) + " is a multiple of " + String.valueOf(n) + ".\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}