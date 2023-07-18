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
    		int C = Integer.parseInt(br.readLine());
    		int[] money = new int[4];
    		
    		while (true) {
    			if (C == 0) break;
    			
    			if (C >= 25) {
    				C -= 25;
    				money[0]++;
    			}
    			else if (C >= 10) {
    				C -= 10;
    				money[1]++;
    			}
    			else if (C >= 5) {
    				C -= 5;
    				money[2]++;
    			}
    			else {
    				C -= 1;
    				money[3]++;
    			}
    		}
    		
    		for (int j = 0; j < 4; j++) {
    			bw.write(String.valueOf(money[j]) + " ");
    		}
    		bw.write("\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}