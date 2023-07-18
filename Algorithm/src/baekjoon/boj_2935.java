import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	BigInteger A = new BigInteger(br.readLine());
    	String op = br.readLine();
    	BigInteger B = new BigInteger(br.readLine());
    	
    	if (op.equals("*")) bw.write(String.valueOf(A.multiply(B)));
    	else bw.write(String.valueOf(A.add(B)));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}