import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int gcd (int a, int b) {
		int tmp, n;
		
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b != 0) {
			n = a % b;
			a = b;
			b = n;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str = br.readLine();
    	String[] s = str.split(":");
    	
    	int num1 = Integer.parseInt(s[0]);
    	int num2 = Integer.parseInt(s[1]);
    	
    	int num = gcd(num1, num2);
    	
    	bw.write(String.valueOf(num1 / num) + ":" + String.valueOf(num2 / num));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}