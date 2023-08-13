import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int minX = Integer.MAX_VALUE;
	public static int maxX = Integer.MIN_VALUE;
	public static int minY = Integer.MAX_VALUE;
	public static int maxY = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			minX = (minX > x) ? x : minX;
			maxX = (maxX < x) ? x : maxX;
			minY = (minY > y) ? y : minY;
			maxY = (maxY < y) ? y : maxY;
		}
		
		bw.write(String.valueOf((maxX - minX) * (maxY - minY)));
		
		bw.flush();
		br.close();
		bw.close();
	}
}