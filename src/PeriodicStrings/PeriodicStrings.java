package PeriodicStrings;

import java.util.Scanner;

public class PeriodicStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		SuffixArray practice = new SuffixArray(text);
		for(int i=1; i<=text.length(); i++) {
			if(text.length() % i == 0) {
				practice.subStrings(i);
				boolean result = practice.check(i);
				if(result) {
					System.out.println(i);
					break;
				}
			}
		}
	
	}
}
