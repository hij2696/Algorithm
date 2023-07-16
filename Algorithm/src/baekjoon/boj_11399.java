import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	String str = br.readLine();
    	StringTokenizer st = new StringTokenizer(str);
    	
    	int[] arr = new int[N];
    	
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(arr);
    	
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j <= i; j++) {
    			sum += arr[j];
    		}
    	}
    	
    	System.out.print(sum);
    }
}