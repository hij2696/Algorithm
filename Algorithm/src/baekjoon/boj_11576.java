import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		for (int i = m - 1; i >= 0; i--) {
			int num = Integer.parseInt(st.nextToken());
			sum += num * Math.pow(A, i);
		}
		
		while (sum != 0) {
			stack.push(sum % B);
			sum /= B;
		}
		
		while (!stack.isEmpty()) bw.write(String.valueOf(stack.pop()) + " ");
		
		bw.flush();
		br.close();
		bw.close();
	}
}