import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	boolean checked = false;
    	
    	for (int i = 0; i < 31; i++) {
    		if (Math.pow(2, i) == N) {
    			checked = true;
    			break;
    		}
    	}
    	
    	if (checked) bw.write("1");
    	else bw.write("0");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}