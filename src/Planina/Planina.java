package Planina;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Planina {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Kattis: Planina
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int result = (int) ((Math.pow(2, input)+1)*(Math.pow(2, input)+1));
		bw.write(result + "\n");
		bw.flush();

	}

}
