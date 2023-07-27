import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	
	public static int[] reverse(int a, int b) {
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if ((a + b) / 2 < i) break;
			
			int tmp = arr[i];
			arr[i] = arr[b-cnt];
			arr[b-cnt] = tmp;
			cnt++;
		}
		return arr;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	arr = new int[20];
    	
    	for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
    	
    	for (int i = 0; i < 10; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()) - 1;
    		int b = Integer.parseInt(st.nextToken()) - 1;
    		
    		reverse(a, b);
    	}
    	
    	for (int i = 0; i < arr.length; i++) bw.write(String.valueOf(arr[i]) + " ");
    	    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}