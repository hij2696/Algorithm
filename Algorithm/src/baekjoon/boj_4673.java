import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static int selfNumber(int num) {
		int sum = num;
		
		while(true) {
			if (num == 0) break;
			
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	boolean[] checkedSelfNumber = new boolean[10001];
    	
    	for (int i = 1; i < 10001; i++) {
    		int n = selfNumber(i);
    		
    		if (n < 10001) checkedSelfNumber[n] = true;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 1; i < 10001; i++) if (!checkedSelfNumber[i]) sb.append(i).append("\n");
    	
    	bw.write(String.valueOf(sb));
    	
    	bw.flush();
    	bw.close();
    }
}