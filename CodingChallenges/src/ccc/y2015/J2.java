package ccc.y2015;


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
	static int happy = 0;
	static int sad = 0;
	static String inputLine;
	int emoji = 0;

	public static void readInput() {
		// Put some code here.
		inputLine = (readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		int emoji = inputLine.indexOf(":-)");
		while(emoji>0){
			happy ++;
			emoji = inputLine.indexOf(":-)", emoji + 1);
		}
		emoji = inputLine.indexOf(":-(");
		while(emoji>0){
			sad ++;
			emoji = inputLine.indexOf(":-(", emoji + 1);
		}
	}


	public static void printOutput() {
		// Put some code here.
		if (happy == 0 && sad == 0){
			System.out.println ("none");
			return;
		}
		if (happy==sad){
			System.out.println ("unsure");
			return;
		}
		if(happy>sad){
			System.out.println ("happy");
			return;
		}

		System.out.println ("sad");

	}

	//***********************************************************************


}
