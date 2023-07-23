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
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	int M = Integer.parseInt(st1.nextToken());
    	int N = Integer.parseInt(st1.nextToken());
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	int U = Integer.parseInt(st2.nextToken());
    	int L = Integer.parseInt(st2.nextToken());
    	int R = Integer.parseInt(st2.nextToken());
    	int D = Integer.parseInt(st2.nextToken());
    	
    	String[] str = new String[M];
    	for (int i = 0; i < M; i++) {
    		str[i] = br.readLine();
    	}
    	
    	for (int i = 0; i < M + U + D; i++) {
    		for (int j = 0; j < N + L + R; j++) {
    			if (U <= i && i < M + U && L <= j && j < N + L) {
    				bw.write(String.valueOf(str[i - U].charAt(j - L)));
    			}
    			else if ((i + j) % 2 == 0) bw.write("#");
        		else bw.write(".");
    		}
    		bw.write("\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}