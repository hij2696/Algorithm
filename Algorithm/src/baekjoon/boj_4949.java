import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	public static String answer(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[') stack.push(c);
			else if (c == ')') {
				if (stack.isEmpty() || stack.peek() != '(') return "no";
				else stack.pop();
			}
			else if (c == ']') {
				if (stack.isEmpty() || stack.peek() != '[') return "no";
				else stack.pop();
			}
		}
		
		if (stack.isEmpty()) return "yes";
		else return "no";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		
		while (true) {
			s = br.readLine();
			if (s.equals(".")) break;
			
			bw.write(answer(s) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}