package ccc.y2013;


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
	static int Y;
	static int D;
	
	public static void readInput() {
		// Put some code here.
		Y = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		D = Y+1;
		while(!solved()) {
			D = D+1;
			if (D == 10000) { break; }
		}
	}
	
	public static void printOutput() {
		// Put some code here.
		printLine(D);
	}
	
	//***********************************************************************
	
	static boolean solved() {
		int d1, d2, d3, d4;
		
		d1 = D/1000;
		d2 = D/100 - d1*10;
		d3 = D/10 - d2*10 - d1*100;
		d4 = D - d3*10 - d2*100 - d1*1000;
		
		if (d1 == d2) { return false; } 
		if (d1 == d3) { return false; }
		if (d1 == d4) { return false; }
		if (d2 == d3) { return false; }
		if (d2 == d4) { return false; }
		if (d3 == d4) { return false; }
		
		return true;
	}

}
