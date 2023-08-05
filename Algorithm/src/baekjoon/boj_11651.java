import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Coordinates {
	int x, y;
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	Coordinates[] c = new Coordinates[N];
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		c[i] = new Coordinates(x, y);
    	}
    	
    	Arrays.sort(c, (a, b) -> {
    		if (a.y != b.y) return a.y - b.y;
    		return a.x - b.x;
    	});
    	
    	for (int i = 0; i < c.length; i++) {
    		bw.write(String.valueOf(c[i].x) + " " + String.valueOf(c[i].y) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}