package ccc.y2013;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J4 {
	
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
	static int t;
	static int c;
	static int totaltime;
	static int totalchores;
	
	static List<Integer> chores;
	
	public static void readInput() {
		// Put some code here.
		t = new Integer(readLine());
		c = new Integer(readLine());
		
		chores = new ArrayList<Integer>(c);
		
		for(int i=0; i<c; i++){
			
			int chore = new Integer(readLine());
			chores.add(chore);
		}
	}

	public static void solvePuzzle() {
		// Put some code here.
		Collections.sort(chores);
		totaltime = 0;
		totalchores = 0;
		
		for(Integer chore:chores){
			totaltime = totaltime + chore;
			if (totaltime > t) { break; }
			totalchores ++;
		}
	}
	
	public static void printOutput() {
		// Put some code here.
		System.out.println(totalchores);
	}
	//***********************************************************************
	
	
}
