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
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int index = Integer.parseInt(st.nextToken()) - 1;
    		String str = st.nextToken();
    		
    		String new_str = str.substring(0, index) + str.substring(index + 1);
    		bw.write(new_str + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}