package adventofcode.y2016;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Day2 {
	private Scanner br = new Scanner(System.in);
	public static void main(String[] args) {
		Day2 o = new Day2();
		o.run();
	}
	
	public void run() {
		readInput();
		solve();
		printSolution();
	}
	private String readLine() {
			return br.nextLine();
	}
	//***********************************************
	// Define some variables
	//***********************************************
	String s;
	int counter = 0;
	
	private void readInput() {
		s = readLine();
	}
	
	
	private void solve() {
		char[] c = new char[s.length()];
		c = s.toCharArray();
		System.out.println(c);
		for (int i = 0; i<c.length;i++){
			//if (counter == -1){
			//	System.out.println(i);
			//	System.exit(0);
			//}
				
			if(c[i] == '('){
				counter++;
			}
			else{
				counter--;
			}
		}
		System.out.println(counter);
	}
	
	
	private void printSolution() {
		
	}
}
