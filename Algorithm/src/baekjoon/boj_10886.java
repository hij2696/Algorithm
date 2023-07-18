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
    	int cute = 0, not_cute = 0;
    	
    	for (int i = 0; i < N; i++) {
    		int M = Integer.parseInt(br.readLine());
    		
    		if (M == 1) cute++;
    		else not_cute++;
    	}
    	
    	if (cute > not_cute) bw.write("Junhee is cute!");
    	else bw.write("Junhee is not cute!");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}