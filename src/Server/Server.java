package Server;

import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numberOfTasks = scan.nextInt();
		int totalTime = scan.nextInt();
		int[] tasks = new int[numberOfTasks];
		for(int i =0; i<numberOfTasks; i++) {
			tasks[i] = scan.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		for(int j=0; j<tasks.length; j++) {
			sum += tasks[j];
			if(sum > totalTime) {
				break;
			}
			count++;
				
		}
		System.out.println(count);
	}

}
