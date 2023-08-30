import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean distinction(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	HashMap<String, Integer> pokemon = new HashMap<String, Integer>();
    	String[] pokemonArr = new String[N + 1];
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 1; i <= N; i++) {
    		String name = br.readLine();
    		pokemon.put(name, i);
    		pokemonArr[i] = name;
    	}
    	
    	while (M-- > 0) {
    		String s = br.readLine();
    		if (distinction(s)) {
    			int idx = Integer.parseInt(s);
    			sb.append(pokemonArr[idx]).append("\n");
    		}
    		else {
    			sb.append(pokemon.get(s)).append("\n");
    		}
    	}
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}