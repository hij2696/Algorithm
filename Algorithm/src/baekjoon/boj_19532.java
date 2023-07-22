import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] s = br.readLine().split(" ");
    	int a, b, c, d, e, f;
    	int x = 0, y = 0;
    	
    	a = Integer.parseInt(s[0]);
    	b = Integer.parseInt(s[1]);
    	c = Integer.parseInt(s[2]);
    	d = Integer.parseInt(s[3]);
    	e = Integer.parseInt(s[4]);
    	f = Integer.parseInt(s[5]);
    	
    	for (int i = -999; i <= 999; i++) {
    		for (int j = -999; j <= 999; j++) {
    			if (((a * i) + (b * j)) == c && ((d * i) + (e * j)) == f) {
    				x = i;
    				y = j;
    				break;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(x) + " " + String.valueOf(y));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}