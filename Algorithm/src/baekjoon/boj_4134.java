/* 연습장 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	
	public static BigInteger primeNumber(BigInteger n) {
		if (n.isProbablePrime(10)) return n;
		else return n.nextProbablePrime();
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		long num = Long.parseLong(br.readLine());
    		BigInteger n = new BigInteger(String.valueOf(num));
    		bw.write(primeNumber(n) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}