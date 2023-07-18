import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static final int NUM = 4;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int[] distance = new int[NUM];
    	
    	int x = Integer.parseInt(st.nextToken());
    	int y = Integer.parseInt(st.nextToken());
    	int w = Integer.parseInt(st.nextToken());
    	int h = Integer.parseInt(st.nextToken());
    	
    	distance[0] = x;
    	distance[1] = y;
    	distance[2] = w - x;
    	distance[3] = h - y;
    	
    	Arrays.sort(distance);
    	
    	bw.write(String.valueOf(distance[0]));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}