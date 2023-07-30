import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N;
    	while ((N = Integer.parseInt(br.readLine())) != -1) {
    		int sum = 0;
    		int[] arr = new int[N / 2 + 1];
    		for (int i = 1; i <= N / 2; i++) {
    			if (N % i == 0) {
    				sum += i;
    				arr[i]++;
    			}
    		}
    		if (N != sum) bw.write(String.valueOf(N) + " is NOT perfect.\n");
    		else {
    			bw.write(String.valueOf(N) + " = ");
    			for (int i = 1; i < arr.length; i++) {
    				if (arr[i] == 1) {
    					if (i != N / 2) {
    						bw.write(String.valueOf(i) + " + ");
    					}
    					else {
    						bw.write(String.valueOf(i) + "\n");
    					}
    				}
    			}
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}