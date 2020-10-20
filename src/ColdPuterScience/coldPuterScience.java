package ColdPuterScience;

import java.util.Scanner;

public class coldPuterScience {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//read number of temperatures the user will input
		String number = scan.nextLine();
		int numberOfInputs = Integer.parseInt(number);
		//read all temperatures in one line
		String all = scan.nextLine();
		// splits each temperature into an array
		String[] each = all.split(" ");
		int total = 0;
		for(int i=0; i<numberOfInputs; i++) {
			int input = Integer.parseInt(each[i]);
			if(input<0) {
				total = total+1;
			}
		}
		System.out.println(total);
		scan.close();
	}
}
