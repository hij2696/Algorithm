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
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		int n = Integer.parseInt(br.readLine());
    		int player1 = 0;
    		int player2 = 0;
    		for (int j = 0; j < n; j++) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			char p1 = st.nextToken().charAt(0);
    			char p2 = st.nextToken().charAt(0);
    			
    			if (p1 == 'P' && p2 == 'R') player1++;
    			if (p1 == 'R' && p2 == 'P') player2++;
    			if (p1 == 'S' && p2 == 'P') player1++;
    			if (p1 == 'P' && p2 == 'S') player2++;
    			if (p1 == 'R' && p2 == 'S') player1++;
    			if (p1 == 'S' && p2 == 'R') player2++;
    		}
    		
    		if (player1 == player2) bw.write("TIE\n");
    		else if (player1 > player2) bw.write("Player 1\n");
    		else bw.write("Player 2\n");
    	}
    	    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}