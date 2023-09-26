import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	String[] books = new String[N];
    	
    	for (int i = 0; i < N; i++) books[i] = br.readLine();
    	
    	Arrays.sort(books);
    	int[] idxCheck = new int[N];
    	
    	for (int i = 0; i < N - 1; i++) {
    		if (idxCheck[i] == 1) continue;
    		
    		for (int j = i + 1; j < N; j++) {
    			if (books[i].equals(books[j])) {
    				idxCheck[i]++;
    				idxCheck[j]++;
    			}
    		}
    	}
    	
    	int idx = 0, maxIdx = Integer.MIN_VALUE;
    	for (int i = 0; i < idxCheck.length; i++) {
    		if (idxCheck[i] > maxIdx) {
    			maxIdx = idxCheck[i];
    			idx = i;
    		}
    	}
    	
    	bw.write(books[idx]);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}