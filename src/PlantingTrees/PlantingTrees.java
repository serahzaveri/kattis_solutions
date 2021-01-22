package PlantingTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlantingTrees {

	public static void main(String[] args) {
		// Kattis: Planting Trees
		//Greedy Algorithm 
		
		Scanner scan = new Scanner(System.in);
		int numberOfTrees = scan.nextInt();
		ArrayList<Integer> growthDays = new ArrayList<>();
		for(int i=0; i<numberOfTrees; i++) {
			growthDays.add(scan.nextInt());
		}
		//we sort the arraylist in descending order
		Collections.sort(growthDays, Collections.reverseOrder());
		//total days minimum will have to be the greatest value of the tree to grow + 1 day to plant
		int totalDays = 1 + growthDays.get(0);
		int dayCount = 1;
		//loop through rest of the trees
		for(int j=1; j<numberOfTrees; j++) {
			dayCount++;
			//if days needed to grow the tree exceeds the total days then we add the extra days onto total days
			if(totalDays - dayCount < growthDays.get(j)) {
				totalDays += (growthDays.get(j) - (totalDays - dayCount));
			}
		}
		// 1 extra day to add cause party will be on the next day
		totalDays++;
		System.out.println(totalDays);
		scan.close();
	}

}
