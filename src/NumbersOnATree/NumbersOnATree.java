package NumbersOnATree;
import java.util.Scanner;

public class NumbersOnATree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] input = line.split(" ");
		int treeHeight = Integer.parseInt(input[0]);
		String traversal = "";
		if(input.length == 2) {
			traversal = input[1];
		}
		long numberOfNodes = (long) Math.pow(2, treeHeight+1) - 1;
		
		if(traversal == "") {
			System.out.println(numberOfNodes);
			return;
		}
		
		long position = 1;
		for(int j=0; j<traversal.length() && j<treeHeight; j++) {
			char direction = traversal.charAt(j);
			if(direction == 'L') {
				position = position*2;
			}
			else if(direction == 'R') {
				position = (position*2)+1;
			}
		}
		System.out.println(numberOfNodes+1-position);
	}

}
