package ccc.y2011;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1 {
	
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
	static int y;
	static int m;
	static int o;
	static int d;
	
	public static void readInput() {
		// Put some code here.
		y = new Integer(readLine());
		m = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		d = m-y;
		o = d+m;
	}
	
	public static void printOutput() {
		// Put some code here.
		printLine(o);
	}

}
