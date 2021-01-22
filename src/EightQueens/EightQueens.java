package EightQueens;

import java.util.Scanner;

public class EightQueens {

	public static void main(String[] args) {
		// Kattis: Eight Queens
		Scanner scan = new Scanner(System.in);
		char[][] chessBoard = new char[8][8];
		//getting the input
		for(int i=0; i<8; i++) {
			String line = scan.nextLine();
			for(int j=0; j<8; j++) {
				chessBoard[i][j] = line.charAt(j);
			}
		}
		int numberOfQueens = 0;
		for(int e=0; e<8; e++) {
			for(int f=0; f<8; f++) {
				if(chessBoard[e][f] == '*')
					numberOfQueens++;
				
			}
		}
		if(numberOfQueens != 8) {
			System.out.println("invalid");
			return;
		}
			
		//check to see if valid
		boolean result = check(chessBoard);
		if(result)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}
	
	private static boolean check(char[][] chessBoard) {
		for(int k=0; k<8; k++) {
			for(int l=0; l<8; l++) {
				if(chessBoard[k][l] == '*') {
					//check columns
					for(int m=0; m<8; m++) {
						if(chessBoard[k][m] == '*' && m!=l) {
							return false;
						}
					}
					//check rows
					for(int n=0; n<8; n++) {
						if(chessBoard[n][l] == '*' && n!=k) {
							return false;
						}
					}
					//check diagnols 1
					for(int p=k+1, q=l+1; p<8 && q<8; p++, q++) {
						if(chessBoard[p][q] == '*') {
							return false;
						}
					}
					//check diagnols 2
					for(int y=k-1, z=l-1; y>=0 && z>=0; y--, z--) {
						if(chessBoard[y][z] == '*') {
							return false;
						}
					}
					//check diagnols 3
					for(int a=k+1, b=l-1; a<8 && b>=0; a++, b--) {
						if(chessBoard[a][b] == '*') {
							return false;
						}
					}
					//check diagnols 4
					for(int c=k-1, d=l+1; c>=0 && d<8; c--, d++) {
						if(chessBoard[c][d] == '*') {
							return false;
						}
					}
				}	
			}
		}
		return true;
	}

}
