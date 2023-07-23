import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int gcd(int num1, int num2) {
		int num = 1;
		for (int i = 1; i <= (num1 > num2 ? num2 : num1); i++)
			if (num1 % i == 0 && num2 % i == 0) num = i;
		return num;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		
    		int num = gcd(A, B);
    		
    		bw.write(String.valueOf((A * B) / num) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}