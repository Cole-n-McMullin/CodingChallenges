package ccc.y2012;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1 {

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
	static int sl;
	static int s;
	public static void readInput() {
		// Put some code here.
		System.out.println("Please enter the speed limit.");
		sl = new Integer (readLine());
		System.out.println("Please enter the speed of the car.");
		s = new Integer (readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		if (s >= (sl+31)){
			System.out.println("You are speeding and your fine is $500 :)");
			return;
		}
		if (s >= (sl+21)){
			System.out.println("You are speeding and your fine is $270");
			return;
		}
		
		if (s >= (sl+1)){
			System.out.println("You are speeding and your fine is $100");
			return;
		}
		else {
			System.out.println("Congratulations you are within the speed limit!");
		}
		
	}

	public static void printOutput() {
		// Put some code here.

	}

	//***********************************************************************


}
