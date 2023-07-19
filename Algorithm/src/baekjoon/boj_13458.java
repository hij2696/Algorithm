import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] A = new int[N];
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++)
    		A[i] = Integer.parseInt(st1.nextToken());
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	int B = Integer.parseInt(st2.nextToken());
    	int C = Integer.parseInt(st2.nextToken());
    	
    	long num = N;
    	for (int i = 0; i < N; i++) {
    		A[i] -= B;
    		if (A[i] <= 0) continue;
    		num += A[i] / C;
    		if (A[i] % C != 0) num++;
    	}
    	
    	bw.write(String.valueOf(num));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}