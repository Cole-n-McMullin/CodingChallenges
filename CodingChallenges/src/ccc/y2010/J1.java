package ccc.y2010;



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
	static int n;
	
	public static void readInput() {
		// Put some code here.
		n = new Integer(readLine());
	}
	
	public static void solvePuzzle() {
		// Put some code here.
		
	}
	
	public static void printOutput() {
		// Put some code here.
		if (n == 1){
			printLine ("1");
			return;
		}
		if (n == 2){
			printLine ("1");
			return;
		}
		if (n == 3){
			printLine ("2");
			return;
		}
		if (n == 4){
			printLine ("3");
			return;
		}
		if (n == 5){
			printLine ("3");
			return;
		}
		if (n == 6){
			printLine ("3");
			return;
		}
		if (n == 7){
			printLine ("2");
			return;
		}
		if (n == 8){
			printLine ("2");
			return;
		}
		if (n == 9){
			printLine ("1");
			return;
		}
		printLine("1");
			
	}

}
