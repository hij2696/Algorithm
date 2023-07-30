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
    	
    	int[] num = new int[5];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(st.nextToken());
    	
    	int cnt = 0, val = 1;
    	
    	while (true) {
    		for (int i = 0; i < num.length; i++) {
    			if (val % num[i] == 0) cnt++;
    		}
    		if (cnt >= 3) {
    			bw.write(String.valueOf(val));
    			break;
    		}
    		cnt = 0;
    		val++;
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}