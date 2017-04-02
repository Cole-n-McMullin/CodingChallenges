package ccc.y2011;


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
	static int t1 = 0;
	static int t2 = 0;
	static int t3 = 0;
	static int tally = 2;

	public static void readInput() {
		// Put some code here.
		t1 = new Integer(readLine());
		t2 = new Integer(readLine());
	}

	public static void solvePuzzle() {
		// Put some code here.
		while(true){
			if (t2 <= 0){
				break;
			}
			if (t2 > t1){
				break;
			}
			t3 = t1 - t2;
			t1 = t2;
			t2 = t3;		
			tally ++;
		}
	}



	public static void printOutput() {
		// Put some code here.
		System.out.println(tally);	
	}

}
