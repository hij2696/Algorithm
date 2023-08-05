import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int switchNum = Integer.parseInt(br.readLine());
    	int[] button = new int[switchNum];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < switchNum; i++) {
    		button[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int studentNum = Integer.parseInt(br.readLine());
    	for (int i = 0; i < studentNum; i++) {
    		st = new StringTokenizer(br.readLine());
    		int gender = Integer.parseInt(st.nextToken());
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(gender == 1) {
				for(int j = 0; j < switchNum; j++)
					if((j + 1) % num == 0) button[j] = button[j] == 0 ? 1 : 0;
			}
    		
    		else {
				button[num - 1] = button[num - 1] == 0 ? 1 : 0;
				
				for(int j = 1; j < switchNum / 2; j++) {
					if(num - 1 + j >= switchNum || num - 1 - j < 0) break;
					
					if(button[num - 1 - j] == button[num - 1 + j]) {
						button[num - 1 - j] = button[num - 1 - j] == 0 ? 1 : 0;
						button[num - 1 + j] = button[num - 1 + j] == 0 ? 1 : 0;
					}
					else break;
				}
			}
    	}
    	
    	for (int i = 0; i < switchNum; i++) {
    		bw.write(String.valueOf(button[i]) + " ");
    		if ((i + 1) % 20 == 0) bw.newLine();
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}