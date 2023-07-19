import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static final int NUM = 8;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = 0;
    	String str = "";
    	
    	for (int i = 0; i < NUM; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		str = st.nextToken();
    		char[] c = str.toCharArray();
    		
    		for (int j = 0; j < NUM; j++)
    			if ((i + j) % 2 == 0 && c[j] == 'F')
    				cnt++;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}