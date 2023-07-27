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
    	int sevenX = Integer.parseInt(st1.nextToken());
    	int sevenY = Integer.parseInt(st1.nextToken());
    	
    	double minPrice = (double) sevenX / sevenY * 1000;
    	
    	int N = Integer.parseInt(br.readLine());
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		int X = Integer.parseInt(st2.nextToken());
    		int Y = Integer.parseInt(st2.nextToken());
    		
    		double price = (double) X / Y * 1000; 
    		minPrice = Math.min(minPrice, price);
    	}
    	
    	bw.write(String.valueOf(minPrice));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}