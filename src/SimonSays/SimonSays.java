package SimonSays;

import java.util.Scanner;

public class SimonSays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		String line;
		for(int i=0; i<cases; i++) {
			line = scan.nextLine();
			if(line.startsWith("Simon says")) {
				System.out.println(line.substring(10, line.length()));
			}
		}
		scan.close();
		
	}

}
