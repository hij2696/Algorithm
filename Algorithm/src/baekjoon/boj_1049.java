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
    	StringTokenizer st = null;
    	
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int[][] guitar = new int[M][2];
    	
    	int minUnit = Integer.MAX_VALUE;
    	int minPackage = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		guitar[i][0] = Integer.parseInt(st.nextToken());
    		guitar[i][1] = Integer.parseInt(st.nextToken());
    		minPackage = Math.min(minPackage, guitar[i][0]);
    		minUnit = Math.min(minUnit, guitar[i][1]);
    	}
    	
    	int sum = 0;
    	
    	if (minPackage < minUnit * 6) {
    		while (N > 6) {
    			sum += minPackage;
    			N -= 6;
    		}
    		if (minPackage < minUnit * N) sum += minPackage;
    		else sum += (minUnit * N);
    	}
    	else {
    		while (N != 0) {
    			sum += minUnit;
    			N--;
    		}
    	}
    	
    	bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}