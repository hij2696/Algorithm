import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st1.nextToken());
    	int k = Integer.parseInt(st1.nextToken());
    	
    	int[] scoreArr = new int[N];
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	for (int i = 0; i < scoreArr.length; i++) {
    		scoreArr[i] = Integer.parseInt(st2.nextToken());
    	}
    	
    	Arrays.sort(scoreArr);
    	
    	bw.write(String.valueOf(scoreArr[N-k]));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}