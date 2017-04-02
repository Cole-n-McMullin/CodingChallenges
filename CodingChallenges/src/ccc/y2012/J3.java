package ccc.y2012;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
	static int k;
	
	public static void readInput() {
		// Put some code here.
		k = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		scaleLine(k,"*","x","*");
		scaleLine(k," ","x","x");
		scaleLine(k,"*"," ","*");
	}

	public static void printOutput() {
		// Put some code here.

	}

	//***********************************************************************
	public static void scaleLine(int k, String char1, String char2, String char3) {
		String s = "";
		for(int i = 0; i < k; i++){
			s = s + char1;
		}
		for(int i = 0; i < k; i++){
			s = s + char2;
		}
		for(int i = 0; i < k; i++){
			s = s + char3;
		}
		for(int i = 0; i < k; i++){
			System.out.println(s);
		}
	}
}
