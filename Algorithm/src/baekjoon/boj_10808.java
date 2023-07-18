import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int NUM = 26;
	public static int[] alphabet = new int[NUM];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String S = br.readLine();
    	
    	for (int i = 0; i < S.length(); i++) {
    		alphabet[S.charAt(i) - 'a']++;
    	}
    	
    	for (int i = 0; i < NUM; i++) {
    		System.out.print(alphabet[i] + " ");
    	}
    }
}