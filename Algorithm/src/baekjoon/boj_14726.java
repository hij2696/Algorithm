import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		long num = Long.parseLong(br.readLine());
    		
    		String str = String.valueOf(num);
    		int numLen = str.length();
    		int sum = 0;
    		
    		while (true) {
    			if (num == 0) break;
    			
    			if (numLen % 2 != 0) {
    				int number = (int)((num % 10) * 2);
    				if (number >= 10) number = (number / 10) + (number % 10);
    				sum += number;
    			}
    			else sum += num % 10;
    			
    			numLen--;
    			num /= 10;
    		}
    		
    		if (sum % 10 == 0) bw.write("T\n");
    		else bw.write("F\n");
    		
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}