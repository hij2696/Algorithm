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
    	
    	String num2 = br.readLine();
    	BigInteger num10 = new BigInteger(num2, 2);
    	String num8 = num10.toString(8);
    	
    	bw.write(String.valueOf(num8));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}