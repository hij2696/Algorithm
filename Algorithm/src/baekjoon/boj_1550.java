import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String hexaNum = br.readLine();
    	int decimalNum = Integer.parseInt(hexaNum, 16);
    	
    	bw.write(String.valueOf(decimalNum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}