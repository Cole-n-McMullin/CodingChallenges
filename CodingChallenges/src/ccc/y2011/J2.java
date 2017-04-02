package ccc.y2011;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static void printLine(String lineText) {
		System.out.println(lineText);
	}
	private static void printLine(int lineText) {
		System.out.println(lineText);
	}
	
	// Read a line from the keyboard
	private static String readLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		readInput();
		solvePuzzle();
		printOutput();
	}
	
	/******************************************************************
	 * Put the code solution here.
	 *******************************************************************/
	static int h;
	static int m;
	static int a;
	
	public static void readInput() {
		// Put some code here.
		h = new Integer(readLine());
		m = new Integer(readLine());
	}
	
	public static void solvePuzzle() {
		// Put some code here.
		for(int t=1; t<=m; t++){
			a = -6*(t*t*t*t) + h*(t*t*t) + 2*(t*t) + t;
			if (a<= 0){
				printLine("the balloon first touches the ground at hour:");
				printLine(t);
				return;
			}
		}
		printLine("The balloon does not touch the ground in the given time.");
	}
	
	public static void printOutput() {
		// Put some code here.
		
			
	}

}
