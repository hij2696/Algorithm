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
    	String str = br.readLine();
    	char[] c = str.toCharArray();
    	int cnt = N + 1;
    	int checked = 0;
    	
    	for (int i = 0; i < N; i++) {
    		if (c[i] == 'L') {
    			cnt--;
    			checked++;
    			i++;
    		}
    	}
    	
    	if (checked == 0) bw.write(String.valueOf(cnt - 1));
    	else bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}