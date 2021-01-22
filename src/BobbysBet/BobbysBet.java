package BobbysBet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BobbysBet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Kattis: Bobbys Bet
		// solved using binomial distribution
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cases = Integer.parseInt(br.readLine());
		int R,S,X,Y,W;
		while(cases>0) {
			String[] currentCase = br.readLine().split(" ");
			R = Integer.parseInt(currentCase[0]);
			S = Integer.parseInt(currentCase[1]);
			X = Integer.parseInt(currentCase[2]);
			Y = Integer.parseInt(currentCase[3]);
			W = Integer.parseInt(currentCase[4]);
			double probability = 0.0;
			for(int y=X; y<=Y; y++) {
				double prob = binomialProb(R, S, y, Y);
				//System.out.println(prob);
				probability += prob;
			}
			if(((probability*W)-1) >0)
				bw.write("yes\n");
			else
				bw.write("no\n");
			cases--;
			bw.flush();
		}
		
	}
	
	private static double binomialProb(int r, int s, int x, int y) {
		
		int step1 = factorial(y) / (factorial(x) * factorial(y-x));
		double prob1 = (double) (s-r+1) / s;
		double prob2 = 1  - prob1;
		return (step1 * Math.pow(prob1, x) * Math.pow(prob2, (y-x)));
		
	}
	
	private static int factorial(int n) {
		if(n==1 || n==0)
			return 1;
		else 
			return (n*factorial(n-1));
	}

}
