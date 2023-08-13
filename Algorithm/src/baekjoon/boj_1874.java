import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
			arr2[i] = arr1[i];
		}
		
		Arrays.sort(arr1);
		
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			stack.push(arr1[i]);
			sb.append("+\n");
			
			while (true) {
				if (stack.isEmpty() || stack.peek() != arr2[idx]) break;
				else if (stack.peek() == arr2[idx]) {
					stack.pop();
					sb.append("-\n");
					idx++;
				}
			}
		}
		
		if (stack.isEmpty()) bw.write(sb.toString());
		else bw.write("NO");
		
		bw.flush();
		br.close();
		bw.close();
	}
}