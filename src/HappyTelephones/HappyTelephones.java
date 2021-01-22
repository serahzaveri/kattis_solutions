package HappyTelephones;

import java.util.Scanner;

public class HappyTelephones {

	public static void main(String[] args) {
		// Kattis: Happy telephones
		Scanner scan = new Scanner(System.in);
		
		while(true){
			int phonecalls = scan.nextInt();
			int intervals = scan.nextInt();
			if(phonecalls == 0 && intervals == 0)
				break;
			int[] entries = new int[phonecalls*2];
			int start;
			int end;
			for(int i=0; i<entries.length; i+=2) {
				scan.nextInt();
				scan.nextInt();
				start = scan.nextInt();
				end = scan.nextInt() + start;
				start += 1;
				end -= 1;
				entries[i] = start;
				entries[i+1] = end;
			}
						
			for(int j=0; j<intervals; j++) {
				int start2 = scan.nextInt();
				int end2 = start2 + scan.nextInt();
				int count = 0;
				for(int k=0; k<entries.length; k=k+2) {
					if(contains(start2, end2, entries[k], entries[k+1])) {
						count+=1;
					}
				}
				System.out.println(count);
			}
		}
		scan.close();
		
		
	}
	
	private static boolean contains(int x1, int x2, int y1, int y2) {
		return(x1 <= y2 && y1 <= x2);
	}

}
