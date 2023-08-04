import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static int OFFSET = 4000;
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	int[] cnt = new int[OFFSET * 2 + 1];
    	
    	double A = 0;
    	int B = 0, C = 10000, D = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    		
    		A += (double)arr[i];
    		cnt[arr[i] + OFFSET]++; // 0 ~ 8000까지의 값의 개수가 들어가 있음
    		if (max < arr[i]) max = arr[i];
    		if (min > arr[i]) min = arr[i];
    	}

    	A = Math.round(A / N);
    	
    	Arrays.sort(arr);
    	B = arr[N / 2];
    	
    	int mode_max = 0;
    	
    	boolean flag = false;
    	
    	for (int i = min + 4000; i <= max + 4000; i++) {
    		if (mode_max < cnt[i]) {
    			mode_max = cnt[i];
    			C = i - 4000;
    			flag = true;
    		}
    		
    		else if (mode_max == cnt[i] && flag == true) {
    			C = i - 4000;
    			flag = false;
    		}
    	}
    	
    	if (max < 0 && min < 0) D = Math.abs(min) - Math.abs(max);
    	else if (max > 0 && min > 0) D = max - min;
    	else D = Math.abs(max) + Math.abs(min);
    	
    	bw.write(String.format("%.0f", A) + "\n" + String.valueOf(B) + "\n" + String.valueOf(C) + "\n" + String.valueOf(D));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}