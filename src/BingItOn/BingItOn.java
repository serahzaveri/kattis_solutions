package BingItOn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BingItOn {

	public static void main(String[] args) throws IOException {
		// Kattis: Bing It On
		// Using trie
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCases = Integer.parseInt(br.readLine());
		TrieNode root = new TrieNode();
		for(int i =0; i<testCases; i++) {
			int result = root.add(br.readLine())-1;
			bw.write(result + "\n");
		}
		bw.flush();
	}
}

class TrieNode{

	TrieNode[] children = new TrieNode[26];
	int times = 0;
	
	public int add(String s) {
		if(s.isEmpty()) {
			times = times +1;
			return this.times;
		}
		int index = s.charAt(0) - 'a';
		if(this.children[index] == null) {
			this.children[index] = new TrieNode();
		}
		this.times++;
		return this.children[index].add(s.substring(1));
		
	}
}
