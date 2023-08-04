import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        
        for (int i = 0; i < N; i++) str[i] = br.readLine();
        
        Arrays.sort(str);
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (String s : str) {
        	if (!arrayList.contains(s)) {
        		arrayList.add(s);
        	}
        }
        
        String[] newStr = arrayList.toArray(new String[arrayList.size()]);
        
        for (int i = 0; i < newStr.length; i++) bw.write(newStr[i] + "\n");

    	bw.flush();
    	br.close();
    	bw.close();
    }
}