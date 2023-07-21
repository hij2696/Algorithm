import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] colorArr = new String[] { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
    	
    	long sum = 0;
    	
    	for (int i = 0; i < 3; i++ ) {
    		String color = br.readLine();
    		for (int j = 0; j < 10; j++) {
    			if (color.equals(colorArr[j])) {
    				if (i == 0) sum += j * 10;
    				else if (i == 1) sum += j;
    				else sum *= Math.pow(10, j);
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}