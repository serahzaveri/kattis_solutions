package SodaSlurper;

import java.util.Scanner;

public class SodaSlurper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		
		int total = e+f;
		int count = 0;
		for(int i=total; i>=c; i -=c) {
			count ++;
			i++;
		}
		
		System.out.println(count);
	}

}
