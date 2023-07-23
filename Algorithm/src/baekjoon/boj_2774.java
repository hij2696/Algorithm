import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		int X = Integer.parseInt(br.readLine());
    		int[] cnt = new int[10];
    		int ans = 0;
    		
    		while (X > 0) {
    			int num = X % 10;
    			cnt[num]++;
    			X /= 10;
    		}
    		
    		for (int j = 0; j < 10; j++) {
    			if (cnt[j] != 0) ans++;
    		}
    		
    		bw.write(String.valueOf(ans) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}