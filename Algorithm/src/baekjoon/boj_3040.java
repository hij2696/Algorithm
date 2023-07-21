import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] num = new int[9];
    	int sum = 0;
    	
    	for (int i = 0; i < num.length; i++) {
    		num[i] = Integer.parseInt(br.readLine());
    		sum += num[i];
    	}
    	
    	for (int i = 0; i < num.length - 1; i++) {
    		for (int j = i + 1; j < num.length; j++) {
    			int cur = num[i] + num[j];
    			if (sum - cur == 100) {
    				num[i] = 0;
    				num[j] = 0;
    				for (int k = 0; k < num.length; k++)
    		    		if (k != i && k != j) bw.write(String.valueOf(num[k]) + "\n");
    			}
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}