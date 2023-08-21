import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long n = Long.parseLong(br.readLine());
        
        long sum = 0;
        for (int i = 1; i <= n - 1; i++) sum += i;
        
        bw.write(String.valueOf(sum) +"\n2");
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}