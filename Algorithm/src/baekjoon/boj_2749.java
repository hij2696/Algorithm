import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int pisano = 1500000;
    	long n = Long.parseLong(br.readLine()) % pisano;
    	
    	long[] num = new long[pisano + 1];
    	
    	num[0] = 0;
    	num[1] = 1;
    	
    	for (int i = 2; i <= pisano; i++) num[i] = (num[i - 1] + num[i - 2]) % 1000000;
    	
    	bw.write(String.valueOf(num[(int)n]));
    	
    	bw.flush();
    	bw.close();
    }
}