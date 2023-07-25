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
    	String[] strArr = new String[N];
    	
    	for (int i = 0; i < N; i++) strArr[i] = br.readLine();
    	
    	int idx = -1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				StringBuffer sb = new StringBuffer(strArr[j]);
				if (strArr[i].equals(sb.reverse().toString())) {
					idx = i;
					break;
				}
			}
			if (idx != -1) break;
		}
		
		bw.write(String.valueOf(strArr[idx].length()) + " " + String.valueOf(strArr[idx].charAt((strArr[idx].length() / 2))));
    	    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}