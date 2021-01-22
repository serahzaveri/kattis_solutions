package Jabuke;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Jabuke {

	public static void main(String[] args) throws IOException {
		// Kattis: Jakube
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//we get the 3 co-ordinates of the triangle
		String[] Co1 = br.readLine().split(" ");
		int x1 = Integer.parseInt(Co1[0]);
		int y1 = Integer.parseInt(Co1[1]);
		
		String[] Co2 = br.readLine().split(" ");
		int x2 = Integer.parseInt(Co2[0]);
		int y2 = Integer.parseInt(Co2[1]);
		
		String[] Co3 = br.readLine().split(" ");
		int x3 = Integer.parseInt(Co3[0]);
		int y3 = Integer.parseInt(Co3[1]);
		
		//ensures we only print upto one decimal place
		float landArea = area(x1, y1, x2, y2, x3, y3);
		bw.write(String.format("%.1f", landArea) + "\n");
		
		//we now get all testcases
		int testcase = Integer.parseInt(br.readLine());
		int x0, y0;
		float a1, a2, a3;
		float sumArea;
		int count=0;
		for(int i=0; i<testcase; i++) {
			String[] co0 = br.readLine().split(" ");
			x0 = Integer.parseInt(co0[0]);
			y0 = Integer.parseInt(co0[1]);
			a1 = area(x1, y1, x2, y2, x0, y0);
			a2 = area(x1, y1, x0, y0, x3, y3);
			a3 = area(x0, y0, x2, y2, x3, y3);
			sumArea = a1+a2+a3;
			// we know tree will be in the area if the sum of the area from all variations is equal to the area of the traingle 
			if(sumArea == landArea)
				count++;
		}
		bw.write(count + "\n");
		bw.flush();
	}
	
	//method to calculate area
	private static float area(int x1, int y1, int x2, int y2, int x3, int y3) {
		float area = (float) ((Math.abs(x1*(y2-y3)+ x2*(y3-y1) + x3*(y1-y2)))/2.0);
		return area;
	}

}
