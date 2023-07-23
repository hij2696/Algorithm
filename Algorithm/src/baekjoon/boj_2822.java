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
    	
    	int[] arr = new int[8];
    	
    	for (int i = 0; i < 8; i++) arr[i] = Integer.parseInt(br.readLine());
    	
    	int[] ans = arr.clone();
    	Arrays.sort(ans);
    	
    	int sum = 0;
    	String str = "";
    	for (int i = 7; i >= 3; i--) {
    		for (int j = 0; j < 8; j++) {
    			if (ans[i] == arr[j]) {
    				sum += arr[j];
    				str += j + 1;
    			}
    		}
    	}
    	
    	char[] charArr = str.toCharArray();
    	Arrays.sort(charArr);
    	
    	bw.write(String.valueOf(sum) + "\n");
    	for (int i = 0; i < 5; i++) bw.write(String.valueOf(charArr[i]) + " ");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}