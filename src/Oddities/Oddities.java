package Oddities;

import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		
		//we use scanner to read input from file
		Scanner scan = new Scanner(System.in);
		int numberOfInputs = scan.nextInt();
		for(int i=0; i < numberOfInputs; i++) {
			int next = scan.nextInt();
			if(next%2 == 0) {
				System.out.println(next + " is even");
			}
			else {
				System.out.println(next + " is odd");
			}
		}
		
	}

}
