package PebbleSolitaire2;

import java.util.ArrayList;
import java.util.Scanner;

public class PebbleSolitaire2 {
	
	private static int minimum;
	private static ArrayList<String> overlay = new ArrayList<String>();
	
	public static void main(String[] args) {
		// Kattis: Pebble Solitaire 1
		String line = "-o--o-oo----";
		int count=0;
		for(int i=0; i<12; i++) {
			if(line.charAt(i)=='o') {
				count++;
			}
		}
		minimum = count;
		overlay.add(line);
		move(line);
		System.out.println(minimum);
		System.out.println(overlay.toString());
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
				overlay.add(trialnext);
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
				overlay.add(trialnext);
				move(trialnext);
			}
		}
	}
}
