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
    	int A = 0, B = 0, C = 0;
    	
    	if (T % 10 != 0) {
    		bw.write("-1");
    	}
    	else {
    		while (T != 0) {
        		if (T >= 300) {
        			T -= 300;
        			A++;
        		}
        		else if (T >= 60) {
        			T -= 60;
        			B++;
        		}
        		else {
        			T -= 10;
        			C++;
        		}
        	}
    		
    		bw.write(String.valueOf(A) + " " + String.valueOf(B) + " " + String.valueOf(C));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}