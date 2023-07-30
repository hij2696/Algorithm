import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int[] num = new int[5];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	boolean checked = false;
    	while (true) {
    		for (int i = 0; i < num.length - 1; i++) {
    			if (num[0] == 1 && num[1] == 2 && num[2] == 3 && num[3] == 4 && num[4] == 5) {
    				checked = true;
    				break;
    			}
    			else if (num[i] < num[i + 1]) continue; 
    			else {
    				int tmp = num[i];
    				num[i] = num[i + 1];
    				num[i + 1] = tmp;
    			}
    			System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);
        	}
    		if (checked) break;
    	}
    }
}