import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int Q = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < Q; i++) {
    		boolean checked = false;
    		int a = Integer.parseInt(br.readLine());
    		for (int j = 0; j < 31; j++) {
    			if (Math.pow(2, j) == a) {
        			checked = true;
        			break;
        		}
    		}
    		if (checked) bw.write("1\n");
        	else bw.write("0\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}