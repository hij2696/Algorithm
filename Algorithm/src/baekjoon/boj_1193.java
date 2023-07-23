import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int X = Integer.parseInt(br.readLine());
    	int cnt = 0, num = 1, num_x = 0, num_y = 0;
    	
    	while (cnt < X) cnt += num++;
    	
    	if ((num - 1) % 2 == 0) {
    		num_x = (cnt - X) + 1;
    		num_y = (num - 1) - (cnt - X);
    	}
    	else {
    		num_x = (num - 1) - (cnt - X);
    		num_y = (cnt - X) + 1;
    	}
    	
    	bw.write(String.valueOf(num_y) + "/" + String.valueOf(num_x));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}