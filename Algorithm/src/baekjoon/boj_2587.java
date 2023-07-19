import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static final int NUM = 5;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] num = new String[NUM];
    	int sum = 0;
    	
    	for (int i = 0; i < num.length; i++) {
    		num[i] = br.readLine();
    		sum += Integer.parseInt(num[i]);
    	}
    	
    	int avg = sum / NUM;
    	
    	Arrays.sort(num);
    	int middle = Integer.parseInt(num[2]);
    	
    	bw.write(String.valueOf(avg) + "\n" + String.valueOf(middle));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}