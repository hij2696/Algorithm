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
    	int[] num = new int[N];
    	int height = 0, cnt = 0;
    	
    	for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(br.readLine());
    	
    	for (int i = num.length - 1; i >= 0; i--) {
    		if (height < num[i]) {
    			height = num[i];
    			cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}