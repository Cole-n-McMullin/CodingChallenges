package ccc.y2014;


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
	static int V;
	static String voteline;
	static int A;
	static int B;

	public static void readInput() {
		// Put some code here.
		V = new Integer(readLine());
		voteline = (readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		char[] votes = voteline.toCharArray();
		for(int i=0; i<votes.length; i++) {
			char vote = votes[i];
			if (vote == 'A') {
				A++;
			}
			else {
				B++;		
			}

		}

	}

	public static void printOutput() {
		// Put some code here.
		if (A==B){
			System.out.println ("Tie");
			return;
		}
		if(A>B){
			System.out.println ('A');
		}
		else {
			System.out.println ('B');
		}
	}

	//***********************************************************************


}
