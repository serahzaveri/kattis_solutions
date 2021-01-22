package Vacuumba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Vacuumba {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Kattis: Vacuumba
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCases = Integer.parseInt(br.readLine());
		int numberOfSegments;
		double[] rotation;
		double[] distance;
		double x;
		double y;
		for(int i=0; i<testCases; i++) {
			numberOfSegments = Integer.parseInt(br.readLine());
			x =0.0;
			y = 0.0;
			double finlaAngle = 0;
			rotation = new double[numberOfSegments];
			distance = new double[numberOfSegments];
			for(int j=0; j<numberOfSegments; j++) {
				String[] coordinates = br.readLine().split(" ");
				// we convert the angle in degree to radians
				rotation[j] = -Double.parseDouble(coordinates[0]) * Math.PI / 180;
				finlaAngle += rotation[j];
				distance[j] = Double.parseDouble(coordinates[1]);
				x += distance[j] * Math.sin(finlaAngle);
				y += distance[j] * Math.cos(finlaAngle);
			}
			bw.write(x +" " + y+ "\n");	
		}
		bw.flush();
	}
}
