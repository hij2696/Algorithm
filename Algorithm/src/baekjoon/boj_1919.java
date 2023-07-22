import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str1 = br.readLine();
    	String str2 = br.readLine();
    	
    	int[] num1 = new int[26];
    	int[] num2 = new int[26];
    	int cnt = 0;
    	
    	for (int i = 0; i < str1.length(); i++) num1[str1.charAt(i) - 'a']++;
    	for (int i = 0; i < str2.length(); i++) num2[str2.charAt(i) - 'a']++;
    	
    	for (int i = 0; i < 26; i++) {
    		if (num1[i] != num2[i] && num1[i] == 0 || num2[i] == 0) {
    			cnt += num1[i] > num2[i] ? num1[i] : num2[i];
    		}
    		else if (num1[i] != num2[i] && num1[i] != 0 && num2[i] != 0) {
    			cnt += num1[i] - num2[i] > 0 ? num1[i] - num2[i] : num2[i] - num1[i];
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}