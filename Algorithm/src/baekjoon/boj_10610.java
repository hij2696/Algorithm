/* 연습장 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str = br.readLine();
    	long strLen = str.length();
    	int[] numCountArr = new int[10];
    	
    	long total = 0;
    	for (int i = 0; i < strLen; i++) {
    		int num = Integer.parseInt(str.substring(i, i + 1));
    		numCountArr[num] += 1;
    		total += num;
    	}
    	
    	if (!str.contains("0") || total % 3 != 0) {
    		System.out.println("-1");
    		return;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 9; i >= 0; i--) {
    		while (numCountArr[i] > 0) {
    			sb.append(i);
    			numCountArr[i]--;
    		}
    	}
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}