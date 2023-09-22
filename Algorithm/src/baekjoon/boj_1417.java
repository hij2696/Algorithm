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
    	
    	if (N == 1) {
    		System.out.print(0);
    		System.exit(0);
    	}
    	
    	int num1 = Integer.parseInt(br.readLine());
    	int[] nums = new int[N - 1];
    	for (int i = 0; i < N - 1; i++) nums[i] = Integer.parseInt(br.readLine());
    	
    	int cnt = 0;
    	while (true) {
    		Arrays.sort(nums);
    		if (nums[N - 2] < num1) break;
    		
    		cnt++;
    		nums[N - 2]--;
    		num1++;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}