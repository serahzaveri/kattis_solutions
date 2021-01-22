package Natrij;

import java.util.Scanner;

public class Natrij {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String currentTime = scan.nextLine();
		String[] currentTimeSplit = currentTime.split(":");
		String explosionTime = scan.nextLine();
		String[] explosionTimeSplit = explosionTime.split(":");
		String[] difference = difference(currentTimeSplit, explosionTimeSplit);
		System.out.println(difference[0]+":"+difference[1]+":"+difference[2]);
	}
	
	private static String[] difference(String[] currentTimeSplit, String[] explosionTimeSplit) {
		String[] difference = new String[3];
		int secDif = 0;
		int minDif =0;
		int hourDif = 0;
		
		//check seconds first
		secDif = Integer.parseInt(explosionTimeSplit[2]) - Integer.parseInt(currentTimeSplit[2]);
		if(secDif < 0) {
			secDif += 60;
			minDif -=1;
		}
		difference[2] = String.valueOf(secDif);
		if(difference[2].length() == 1)
			difference[2] = "0"+difference[2];
		
		//check minutes next
		minDif += (Integer.parseInt(explosionTimeSplit[1]) - Integer.parseInt(currentTimeSplit[1]));
		if(minDif < 0) {
			minDif += 60;
			hourDif -= 1;
		}
		difference[1] = String.valueOf(minDif);
		if(difference[1].length() == 1)
			difference[1] = "0"+difference[1];
		//check hours next
		hourDif += (Integer.parseInt(explosionTimeSplit[0]) - Integer.parseInt(currentTimeSplit[0]));
		if(hourDif < 0) {
			hourDif += 24;
		}
		if(hourDif+minDif+secDif == 0)
			hourDif += 24;
		
		difference[0] = String.valueOf(hourDif);
		if(difference[0].length() == 1)
			difference[0] = "0"+difference[0];
		
		return difference;
	}

}
