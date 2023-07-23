import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st1.nextToken());
    	int B = Integer.parseInt(st1.nextToken());
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	int C = Integer.parseInt(st2.nextToken());
    	int D = Integer.parseInt(st2.nextToken());
    	
    	int numerator = (A * D) + (B * C);
    	int denominator = B * D;
    	
    	int mod = gcd(numerator, denominator);
    	
    	numerator /= mod;
    	denominator /= mod;
    	
    	bw.write(numerator + " " + denominator);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}