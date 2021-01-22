package PeriodicStrings;

import java.util.ArrayList;

public class SuffixArray {
	
	String text;
	int n; //length of substring
	ArrayList<String> substrings;
	
	public SuffixArray(String pText) {
		text = pText;
		n = pText.length();
	}
	
	public void subStrings(int length) {
		substrings = new ArrayList<>();
		for(int i=0; i<=this.text.length()-length; i=i+length) {
			substrings.add(text.substring(i, i+length));
		}
	}
	
	public boolean check(int length) {
		for(int i=0; i<this.substrings.size()-1; i++) {
			//edit the string to make last letter the first letter
			String temp = "";
			String temp1 = Character.toString(this.substrings.get(i).charAt(length-1));
			String temp2 = this.substrings.get(i).substring(0, length-1);
			temp = temp1 + temp2;
			if(!temp.equals(this.substrings.get(i+1))) {
				return false;
			}
		}
		return true;
	}
	
	private void printSubstrings() {
		for(String s: this.substrings) {
			System.out.println(s);
		}
	}

}
