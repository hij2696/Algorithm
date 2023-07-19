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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	String str = st.nextToken();
    	int num = Integer.parseInt(st.nextToken());
    	
    	int result = Integer.parseInt(str, num);
    	
    	bw.write(String.valueOf(result));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}