import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] num1 = new int[10];
    	int[] num2 = new int[100];
    	int sum = 0, max = 0, result = 0;
    	
    	for (int i = 0; i < 10; i++) {
    		num1[i] = Integer.parseInt(br.readLine());
    		sum += num1[i];
    		num2[num1[i] / 10]++;
    	}
    	
    	for (int i = 0; i < 100; i++) {
    		if (max < num2[i]) {
    			max = num2[i];
    			result = i * 10;
    		}
    	}
    	
    	bw.write(String.valueOf(sum / 10) + "\n" + String.valueOf(result));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}