import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	public static int cnt;
	
	public static void checked(String s) {
		if (s.length() % 2 == 1) return;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		
		for (int i = 1; i < s.length(); i++) {
			if (stack.size() > 0 && stack.peek() == s.charAt(i)) {
				stack.pop();
			}
			else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty()) cnt++;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		cnt = 0;
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			checked(s);
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		br.close();
		bw.close();
	}
}