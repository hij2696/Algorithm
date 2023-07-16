import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < Y; i++) {
			st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			sum += price * number;
		}
		
		if (X == sum) System.out.print("Yes");
		else System.out.print("No");
	}
}