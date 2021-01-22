package TimeLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TimeLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Kattis: Stuck in a time loop
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		for(int i=1; i<=input; i++) {
			bw.write(i + " Abracadabra" + "\n");	
		}
		bw.flush();
	}

}
