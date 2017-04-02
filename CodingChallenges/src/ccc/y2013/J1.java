package ccc.y2013;


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
	static int eyes;
	static int antenna;


	public static void readInput() {
		// Put some code here.
		System.out.println("How many antennas?");
		antenna = new Integer(readLine());
		System.out.println("How many eyes?");
		eyes = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.

	}

	public static void printOutput() {
		// Put some code here.
		if (eyes<=4 && antenna>=3) {
			System.out.println("TroyMartian");
		}

		if (eyes>=2 && antenna<=6) {
			System.out.println("VladSaturnian");
		}

		if (eyes<=3 && antenna<=2) {
			System.out.println("GraemeMercurian");
		}

	}

}
