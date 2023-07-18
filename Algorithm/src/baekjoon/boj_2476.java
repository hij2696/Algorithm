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
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	int max = 0;
    	for (int i = 0; i < N; i++) {
    		
    		int[] dice = new int[3];
    		int dice_max_num = 0, sum = 0;
    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < dice.length; j++) {
    			dice[j] = Integer.parseInt(st.nextToken());
    			
    			if (dice_max_num < dice[j]) dice_max_num = dice[j];
    		}
    		
    		if (dice[0] == dice[1] && dice[0] == dice[2]) sum = 10000 + (dice[0] * 1000); 
    		else if (dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) sum = dice_max_num * 100;
    		else if (dice[0] == dice[1] || dice[0] == dice[2]) sum = 1000 + (dice[0] * 100);
    		else if (dice[1] == dice[2]) sum = 1000 + (dice[1] * 100);
    		
    		if (max <= sum) max = sum;
    	}
    	
    	bw.write(String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}