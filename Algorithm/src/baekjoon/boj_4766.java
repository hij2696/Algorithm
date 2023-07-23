import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	float num = Float.parseFloat(br.readLine());;
    	while (true) {
    		float input = Float.parseFloat(br.readLine());
    		if ((int)input == 999) break;
    		bw.write(String.format("%.2f", input - num) + "\n");
    		num = input;
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}