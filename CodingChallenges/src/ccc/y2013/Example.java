package ccc.y2013;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static void printLine(String lineText) {
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
	
	public static void readInput() {
		// Put some code here.
	}

	public static void solvePuzzle() {
		// Put some code here.
	}
	
	public static void printOutput() {
		// Put some code here.
	}

}
