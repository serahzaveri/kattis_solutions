package Peragram;

import java.util.HashMap;
import java.util.Scanner;

public class Peragram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		int size = line.length();
		for(int i=0; i<size; i++) {
			char add = line.charAt(i);
			if(map.containsKey(add))
				map.put(add, map.get(add)+1);
			else
				map.put(add, 1);
		}
		int remove = 0;
		for(char c: map.keySet()) {
			if(map.get(c)%2 !=0)
				remove++;
		}
		if(remove>0)
			remove--;
		System.out.println(remove);
		
	}

}
