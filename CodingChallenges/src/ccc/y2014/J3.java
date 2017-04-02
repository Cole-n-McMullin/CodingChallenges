package ccc.y2014;


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
	static int n;
	static int aScore = 100;
	static int dScore = 100;
	public static void readInput() {
		// Put some code here.
		n = new Integer (readLine());
		for(int i=0; i<n; i++){
			String s =(readLine());
			char[] rolls = s.toCharArray();
			int a = rolls[0] - '0';
			int d = rolls[2] - '0';
			if (a>d){
				dScore = dScore - a;
			}
			if (a<d){
				aScore = aScore - d;
			}
		}
	}

	public static void solvePuzzle() {
		// Put some code here.
		
	}

	public static void printOutput() {
		// Put some code here.
		System.out.println(aScore);
		System.out.println(dScore);
	}

	//***********************************************************************


}
