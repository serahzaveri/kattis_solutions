package BirdsOnAWire;

import java.util.Arrays;
import java.util.Scanner;

public class BirdsOnAWire {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		int[] pos = new int[n];
		for(int i=0; i<n; i++) {
			pos[i] = scan.nextInt();
		}
		int count = 0;
		if(l<13) {
			System.out.println(0);
		}
		else if(n == 0) {
			count = ((l-12)/d) +1 ;
			System.out.println(count);
		}
		else {
			Arrays.sort(pos);
			int side1 = pos[0] - 6;
			int side2 = (l-6) - pos[pos.length -1];
			count = (side1/d) + (side2/d);
			for(int j=0; j<n-1; j++) {
				int dif = pos[j+1] - pos[j];
				count += (dif/d) - 1;
			}
			System.out.println(count);
		}

	}

}
