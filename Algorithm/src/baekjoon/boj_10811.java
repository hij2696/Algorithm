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
    	int N = Integer.parseInt(st1.nextToken());
    	int M = Integer.parseInt(st1.nextToken());
    	
    	int[] basket = new int[N];
    	
    	for (int i = 0; i < basket.length; i++) basket[i] = i + 1;
    	
    	for (int i = 0; i < M; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st2.nextToken()) - 1;
    		int b = Integer.parseInt(st2.nextToken()) - 1;
    		
    		while (a < b) {
    			int tmp = basket[a];
    			basket[a++] = basket[b];
    			basket[b--] = tmp;
    		}
    	}
    	
    	for (int i = 0; i < basket.length; i++) bw.write(String.valueOf(basket[i] + " "));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}