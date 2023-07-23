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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int x = Integer.parseInt(st.nextToken());
    	int y = Integer.parseInt(st.nextToken());
    	int[] day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	
    	int date = y;
    	for (int i = 0; i < x - 1; i++) date += day[i];
    	
    	switch (date % 7) {
    		case 0:
    			bw.write("SUN");
    			break;
    		case 1:
    			bw.write("MON");
    			break;
    		case 2:
    			bw.write("TUE");
				break;
    		case 3:
    			bw.write("WED");
    			break;
    		case 4:
    			bw.write("THU");
    			break;
    		case 5:
    			bw.write("FRI");
    			break;
    		case 6:
    			bw.write("SAT");
    			break;
			default:
				bw.write("Invalid input");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}