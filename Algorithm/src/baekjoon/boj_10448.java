import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = 1, sum = 0;
    	
    	while (true) {
    		sum += cnt;
    		if (sum >= 1000) break;
    		cnt++;
    	}
    	
    	int[] num = new int[cnt];
    	
    	int val = 0;
    	for (int i = 1; i <= num.length; i++) {
    		num[i - 1] = i + val;
    		val = num[i - 1];
    	}

    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		int K = Integer.parseInt(br.readLine());
    		int ans = 0;
    		for (int j = 0; j < num.length; j++) {
    			for (int l = 0; l < num.length; l++) {
    				for (int m = 0; m < num.length; m++) {
    					ans = num[j] + num[l] + num[m];
    					if (ans == K) break;
    				}
    				if (ans == K) break;
    			}
    			if (ans == K) break;
    		}
    		if (ans == K) bw.write("1\n");
    		else bw.write("0\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}