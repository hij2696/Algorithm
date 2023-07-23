import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	int C = Integer.parseInt(br.readLine());
    	int D = Integer.parseInt(br.readLine());
    	int P = Integer.parseInt(br.readLine());
    	int water_rateX = 0;
    	int water_rateY = 0;
    	
    	water_rateX = P * A;
    	if (P <= C) water_rateY = B;
    	else water_rateY = B + (P - C) * D;
    	
    	if (water_rateX > water_rateY) bw.write(String.valueOf(water_rateY));
    	else bw.write(String.valueOf(water_rateX));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}