import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		String str = br.readLine();
    		String[] arr = str.split(" ");
    		float num = Float.parseFloat(arr[0]);
    		
    		for (int j = 1; j < arr.length; j++) {
    			if(arr[j].equals("@")) num *= 3;
    	        else if(arr[j].equals("%")) num += 5;
    	        else if(arr[j].equals("#")) num -= 7;
    		}
    		
    		bw.write(String.valueOf(String.format("%.2f\n", num)));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}