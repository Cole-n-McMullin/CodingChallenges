package ccc.y2012;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2 {

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
	static int a;
	static int b;
	static int c;
	static int d;
	static int nikky;
	static int bryon;
	static int steps;

	public static void readInput() {
		// Put some code here.
		a = new Integer(readLine());
		b = new Integer(readLine());
		c = new Integer(readLine());
		d = new Integer(readLine());
		steps = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		nikky = nikkyPos();
		bryon = bryonPos();
	}

	static int nikkyPos() {
		
		// Count complete step cycles
		int endPos = (steps/(a+b))*(a-b);
		
		int remainder = steps%(a+b);
		
		if (remainder <= a) {
			endPos = endPos + remainder;
		} else {
			endPos = endPos + a - (remainder-a);
		}

		return endPos;
	}

	static int bryonPos() {

		int endPos = (steps/(c+d))*(c-d);
		
		int remainder = steps%(c+d);
		
		if (remainder <= c) {
			endPos = endPos + remainder;
		} else {
			endPos = endPos + c - (remainder-c);
		}

		return endPos;

	}

	public static void printOutput() {
		// Put some code here.
		System.out.println("Nikky : " + nikky + ", Bryon : " + bryon);
		if (nikky>bryon){
			System.out.println("Nikky");
			return;
		}
		if (bryon>nikky){
			System.out.println("Bryon");
			return;
		}
		else{
			System.out.println("Tie");
		}
	}

}
