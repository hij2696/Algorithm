import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int a = 0;
    	int b = 1;
    	
    	while (n > 0) {
    		int tmp = a + b;
    		a = b;
    		b = tmp;
    		n--;
    	}
    	
    	bw.write(String.valueOf(a));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}