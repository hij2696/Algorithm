import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	
    	int[] num = new int[9];
    	int sum = 0;
    	
    	for (int i = 0; i < num.length; i++) {
    		num[i] = Integer.parseInt(br.readLine());
    		sum += num[i];
    	}
    	
    	br.close();
    	
    	for (int i = 0; i < num.length - 1; i++) {
    		for (int j = i + 1; j < num.length; j++) {
    			int cur = num[i] + num[j];
    			if (sum - cur == 100) {
    				num[i] = 0;
    				num[j] = 0;
    				Arrays.sort(num);
    				
    				for (int k = 2; k < 9; k++)
    		    		System.out.println(num[k]);
    				return;
    			}
    		}
    	}
    }
}