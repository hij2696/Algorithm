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
    	
    	int person = 0, max = 0;
    	
    	for (int i = 0; i < 10; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if (i == 0) person += m;
			else if (i == 9) person -= n;
			else person += m - n;
			
			if (max <= person) max = person;
    	}
    	
    	bw.write(String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}