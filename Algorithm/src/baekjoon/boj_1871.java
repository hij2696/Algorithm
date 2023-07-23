import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < N; i++) {
    		String str = br.readLine();
    		String[] car_num = str.split("-");
    		int sum1 = ((car_num[0].charAt(0) - 'A') * 26 * 26) + ((car_num[0].charAt(1) - 'A') * 26) + (car_num[0].charAt(2) - 'A');
    		int sum2 = Integer.parseInt(car_num[1]);
    		
    		if (Math.abs(sum1 - sum2) <= 100) bw.write("nice\n");
    		else bw.write("not nice\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}