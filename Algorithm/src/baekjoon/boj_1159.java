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
    	int[] num = new int[26];
    	
    	for (int i = 0; i < N; i++) {
    		String name = br.readLine();
    		num[name.charAt(0) - 'a']++;
    	}
    	
    	String str = "";
    	for (int i = 0; i < 26; i++) {
    		if (num[i] >= 5) str += (char)(i + 'a');
    	}
    	
    	char[] charArr = str.toCharArray();
    	Arrays.sort(charArr);
    	String result = new String(charArr);
    	
    	if (str.equals("")) bw.write("PREDAJA");
    	else bw.write(result);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}