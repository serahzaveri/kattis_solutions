package ClosestSums;

import java.util.Scanner;

public class ClosestSums {
	
	private static int closestSum;

	public static void main(String[] args) {
		// Kattis: Closest Sums
		Scanner scan = new Scanner(System.in);
		int caseCount =0;
		while(scan.hasNextInt()) {
			caseCount++;
			int caseNumber = scan.nextInt();
			int[] numbers = new int[caseNumber];
			//we get all the distinct integers
			for(int a=0; a<caseNumber; a++) {
				numbers[a] = scan.nextInt();
			}
			int queryNumber = scan.nextInt();
			int[] queries = new int[queryNumber];
			//we get the list of queries
			for(int b=0; b<queryNumber; b++) {
				queries[b] = scan.nextInt();
			}
			System.out.println("Case "+ caseCount + ":");
			for(int c=0; c<queryNumber; c++) {
				closestSum = numbers[0] + numbers[1];
				int query = queries[c];
				closest(numbers, query);
				System.out.println("Closest sum to " + query + " is " + closestSum + ".");
			}
		}
		scan.close();
	}
	
	private static void closest(int[] list, int query) {
		for(int i=0; i<list.length-1; i++) {
			for(int j=i+1; j<list.length; j++) {
				//check all possible sums
				int sum = list[i] + list[j];
				//compare the differences with the query
				int check1 = Math.abs(sum-query);
				int check2 = Math.abs(closestSum-query);
				if(check1 < check2){
					closestSum = sum;
					if(check1 == 0)
						return;
				}
			}
		}
	}

}
