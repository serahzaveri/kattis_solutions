package PebbeSolitaire1;
import java.util.ArrayList;
import java.util.Scanner;

public class PebbleSolitaire1 {
	
	private static int minimum;

	public static void main(String[] args) {
		// Kattis: Pebble Solitaire 1
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int numberOfCases = Integer.parseInt(input);
		//we store all the strings in an arraylist
		ArrayList<String> cases = new ArrayList<>();
		for(int a=0; a<numberOfCases; a++) {
			cases.add(scan.nextLine());
		}
		for(int b=0; b<numberOfCases; b++) {
			String line = cases.get(b);
			int count = 0;
			//first calculate no of pebbles without any moves
			for(int i=0; i<12; i++) {
				if(line.charAt(i)=='o')
					count++;
			}
			minimum = count;
			//we now show recurse through every possible move
			move(line);
			System.out.println(minimum);
		}
		scan.close();
	}
	
	private static void move(String trial) {
		//i only goes to 10 since we check substrings of length 3 for a possible move
		for(int i=0; i<10; i++) {
			//there are only 2 substring which can result in a move
			// 1: oo- => --o
			if(trial.substring(i, i+3).contains("oo-")) {
				String trialnext = trial.substring(0, i) + "--o" + trial.substring(i+3, trial.length());
				int count = 0;
				for(int j=0; j<12; j++) {
					if(trialnext.charAt(j)=='o')
						count++;
				}
				minimum = Math.min(minimum, count);
				//next possible move with this string
				move(trialnext);
			}
			//2: -oo => o--
			else if(trial.substring(i, i+3).contains("-oo")){
				String trialnext = trial.substring(0, i) + "o--" + trial.substring(i+3, trial.length());
				int count = 0;
				for(int j=0; j<12; j++) {
					if(trialnext.charAt(j)=='o')
						count++;
				}
				minimum = Math.min(minimum, count);
				//next possible move with this string
				move(trialnext);
			}
		}
	}

}
