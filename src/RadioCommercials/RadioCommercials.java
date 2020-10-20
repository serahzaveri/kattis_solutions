package RadioCommercials;
import java.util.ArrayList;
import java.util.Scanner;

public class RadioCommercials {
	

	public static void main(String[] args) {
		// Kattis: Radio Commercials
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		String[] arrOfStr = first.split(" ");
		int cBreaks = Integer.parseInt(arrOfStr[0]);
		int cost = Integer.parseInt(arrOfStr[1]);
		String second = scan.nextLine();
		String[] arrOfStr2 = second.split(" ");
		ArrayList<Integer> trial = new ArrayList<Integer>();
		for(int i=0; i<cBreaks; i++)
			trial.add(Integer.parseInt(arrOfStr2[i]));
		int answer = subsequence(trial, cost);
		System.out.println(answer);
		scan.close();
	}
	
	private static int subsequence(ArrayList<Integer> array, int cost) {
		int currentSum = array.get(0) - cost;
		int maximum = currentSum;
		for(int i=1; i<array.size(); i++) {
			//at every index of arraylist we have two options:
			//1 - start a new subarray
			int startNew = array.get(i) - cost;
			//2 - add element to already existing subarray
			int contin = (array.get(i)+currentSum) - cost;
			//whichever is the maximum is the currentSum
			currentSum = Math.max(startNew, contin);
			//maximum only changes if it is higher than previous max
			maximum = Math.max(maximum, currentSum);
		}
		return maximum;
	}
}
