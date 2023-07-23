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
    	char[] sort = String.valueOf(N).toCharArray();
    	
    	for (int i = 0; i < sort.length; i++) {
    		for (int j = i + 1; j < sort.length; j++) {
    			if (sort[i] < sort[j]) {
    				int tmp = sort[i];
    				sort[i] = sort[j];
    				sort[j] = (char) tmp;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(sort));
    	
    	bw.flush();
    	bw.close();
    }
}