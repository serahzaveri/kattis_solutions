package QuickBrownFox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class quickBrownFox {

	public static void main(String[] args) {
		// pangrams
		Scanner scan = new Scanner(System.in);
		//read number of lines/phrases
		String number = scan.nextLine();
		int numberOfPhrases = Integer.parseInt(number);
		for(int i=0; i<numberOfPhrases; i++) {
			//gets the phrase
			String phrase = scan.nextLine();
			//converts the phrase to Lower Case
			String phraseLower = phrase.toLowerCase();
			//gets the number of characters in the phrase
			int length = phraseLower.length();
			HashMap<Integer, Boolean> ascii = new HashMap<Integer, Boolean>();
			//initializes hashmap with all ascii values of characters in lowercase
			for(int j=97; j<=122; j++) {
				ascii.put(j, false);
			}
			//gets each character and updates in hash map
			for(int k=0; k<length; k++) {
				int each = phraseLower.charAt(k);
				if(each>96 && each<123) {
					ascii.put(each, true);
				}
			}
			//getting missing characters
			String output="";
			for(int j=97; j<=122; j++) {
				Boolean result = ascii.get(j);
				if(result == false) {
					output = output + (char)j;
				}
			}
			if(output.isEmpty()) {
				System.out.println("pangram");
			}
			else {
				System.out.println("missing " + output);
			}
		
		}
		scan.close();
	}

}
