import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int K = Integer.parseInt(br.readLine());
    	int[] numArr = new int[K];
    	int cnt = 0;
    	long sum = 0;
    	
    	for (int i = 0; i < K; i++) {
    		int num = Integer.parseInt(br.readLine());
    		
    		if (num != 0) {
    			numArr[cnt] = num;
    			sum += numArr[cnt];
    			cnt++;
    		}
    		else {
    			cnt--;
    			sum -= numArr[cnt];
    			numArr[cnt] = 0;
    		}
    	}
    	
    	System.out.print(sum);
    }
}