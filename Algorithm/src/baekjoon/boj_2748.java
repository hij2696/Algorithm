import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static long[] arr;
	
	public static long fibonacci(int num) {
		if (arr[num] == -1) arr[num] = fibonacci(num - 1) + fibonacci(num - 2);
		return arr[num];
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	arr = new long[N + 1];
    	
    	for (int i = 1; i < N + 1; i++) arr[i] = -1;
    	arr[1] = 1;
    	
    	bw.write(String.valueOf(fibonacci(N)));
    	
    	bw.flush();
    	bw.close();
    }
}