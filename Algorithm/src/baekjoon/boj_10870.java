import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int Fibonacci(int n) {
		if (n <= 1) return n;
		return (Fibonacci(n - 2) + Fibonacci(n - 1));
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	bw.write(String.valueOf(Fibonacci(n)));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}