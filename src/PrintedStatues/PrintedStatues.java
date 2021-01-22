package PrintedStatues;

import java.util.Scanner;

public class PrintedStatues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numberOfStatues = scan.nextInt();
		int numberOfPrinters = 1;
		int count = 0;
		while(numberOfPrinters < numberOfStatues) {
			numberOfPrinters = numberOfPrinters * 2;
			count += 1;
		}
		count += 1;
		System.out.println(count);
		scan.close();
	}

}
