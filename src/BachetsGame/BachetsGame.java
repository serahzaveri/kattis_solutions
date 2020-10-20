package BachetsGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BachetsGame {

	public static void main(String[] args) {
		// Kattis: Bachet's game
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int numberOfStones = scan.nextInt();
			int numberOfMoves = scan.nextInt();
			ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
			//we store all possible moves in an arraylist
			for(int i=0; i<numberOfMoves; i++) {
				possibleMoves.add(scan.nextInt());
			}
			Collections.sort(possibleMoves);
			//creation of an array to store who wins if there are x stones left
			boolean[] results = new boolean[numberOfStones+1];
			results[1] = true; //base case since we know one of the moves has to be 1
			//if number of stones equals a move then we know Stan wins in his first move
			/*if(possibleMoves.contains(numberOfStones)) {
				System.out.println("Stan wins");
				continue;
			}*/
			//we now loop from 2 to numberOfStones to find who wins in each case
			for(int j=2; j<=numberOfStones; j++){
				//if numberofStones remaining equals possibleMoves then we know that person wins since they can pick the last stone
				if(possibleMoves.contains(j)) {
					results[j] = true;
					continue;
				}
				//we now calculate who wins the next turn 
				for(int k=0; k<possibleMoves.size(); k++) {
					if(j-possibleMoves.get(k)>0) {
						if(!results[j-possibleMoves.get(k)]){
							//we know the current person wins since the other player does not win the next turn
							results[j] = true;
							break;
						}
					} else {
						break;
					}
				}
			}
			if(results[numberOfStones]) {
				System.out.println("Stan wins");
			} else{
				System.out.println("Ollie wins");
			}
		}
		scan.close();
	}	
}
