package Carrots;

import java.util.Scanner;

public class Carrots {

	public static void main(String[] args) {
		// Kattis: Solving for carrots
		
		Scanner scan = new Scanner(System.in);
		String main = scan.nextLine();
		String[] values = main.split(" ");
		int contestants = Integer.parseInt(values[0]);
		int problems = Integer.parseInt(values[1]);
		for(int i=0; i<contestants; i++) {
			scan.nextLine();
		}
		System.out.println(problems);
		scan.close();
	}

}
