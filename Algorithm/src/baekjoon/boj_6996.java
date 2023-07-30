import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		st = new StringTokenizer(br.readLine());
    		String A = st.nextToken();
    		String B = st.nextToken();
    		int[] cnt1 = new int[26];
    		int[] cnt2 = new int[26];
    		
    		for (int j = 0; j < A.length(); j++) cnt1[A.charAt(j) - 'a']++;
    		for (int j = 0; j < B.length(); j++) cnt2[B.charAt(j) - 'a']++;
    		
    		int cnt = 0;
    		for (int j = 0; j < 26; j++) {
    			if (A.length() != B.length()) break;
    			if (cnt1[j] == cnt2[j]) cnt += cnt1[j];
    		}
    		
    		if (cnt == B.length()) bw.write(A + " & " + B + " are anagrams.\n");
    		else bw.write(A + " & " + B + " are NOT anagrams.\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}