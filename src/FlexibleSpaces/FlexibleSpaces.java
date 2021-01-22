package FlexibleSpaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class FlexibleSpaces {

	public static void main(String[] args) throws IOException {
		// Kattis: Flexible Spaces
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		int width = Integer.parseInt(input1[0]);
		int numberOfPartitions = Integer.parseInt(input1[1]);
		ArrayList<Integer> partitions = new ArrayList<>();
		String[] input2 = br.readLine().split(" ");
		partitions.add(0);
		partitions.add(width);
		for(int i=0; i<numberOfPartitions; i++) {
			partitions.add(Integer.parseInt(input2[i]));
		}
		ArrayList<Integer> possibleWidths = new ArrayList<>();
		int pWidth;
		for(int j=0; j<partitions.size(); j++) {
			for(int h=j+1; h<partitions.size(); h++) {
				pWidth = Math.abs(partitions.get(h) - partitions.get(j));
				//System.out.println("Here: " + pWidth);
				if(!possibleWidths.contains(pWidth)) {
					possibleWidths.add(pWidth);
				}
			}
		}
		Collections.sort(possibleWidths);
		for(int y=0; y<possibleWidths.size(); y++) {
			bw.write(possibleWidths.get(y) + " ");
		}
		bw.flush();
	}

}
