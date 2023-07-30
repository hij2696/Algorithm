import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	int happy = (s.length() - s.replace(":-)", "").length()) / 3;
    	int sad = (s.length() - s.replace(":-(", "").length()) / 3;
    	
    	if (happy == 0 && sad == 0) bw.write("none");
    	else if (happy == sad) bw.write("unsure");
    	else if (happy > sad) bw.write("happy");
    	else bw.write("sad");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}