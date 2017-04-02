package ccc.y2015;


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
	static int m;
	static int d;

	public static void readInput() {
		// Put some code here.
		m = new Integer(readLine());
		d = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.

	}

	public static void printOutput() {
		// Put some code here.
		if (m>2){
			printLine("After");
			return;
		}
		
		if (m<2){
			printLine("Before");
			return;
		}
		
		if (m == 2 && d < 18){
			printLine("Before");
			return;
		}
		
		if (m == 2 && d > 18){
			printLine("After");
			return;
		}
		
		printLine("Special");
	}

}
