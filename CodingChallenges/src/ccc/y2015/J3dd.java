package ccc.y2015;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3dd {

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
	static String  input;
	static String  output;

	public static void readInput() {
		// Put some code here.
		input =(readLine());

	}

	public static void solvePuzzle() {
		// Put some code here.
		output = "";

		for (char letter: input.toCharArray()) {
			output = output + toRov(letter);
		}
	}

	public static void printOutput() {
		// Put some code here.
		System.out.println(output);
	}

	//***********************************************************************

	private static String toRov(char letter) {

		if (isVowel(letter)) {
			return String.valueOf(letter);
		}

		char nextCons = (char) ((int) letter + 1);
		if (isVowel(nextCons)) {
			nextCons = (char) ((int) nextCons + 1);
		}
		if (nextCons > 'z') nextCons = 'z';
		
		char vowel = 'a';
		if (letter > 'c') {
			vowel = 'e';
		}
		if (letter > 'g') {
			vowel = 'i';
		}
		if (letter > 'l') {
			vowel = 'o';
		}
		if (letter > 'r') {
			vowel = 'u';
		}
		return String.valueOf(letter) + String.valueOf(vowel)
				+ String.valueOf(nextCons);
	}

	private static boolean isVowel(char letter) {
		
		if (   letter == 'a'
			|| letter == 'e'
			|| letter == 'i'
			|| letter == 'o'
			|| letter == 'u') {
			return true;
		}
		return false;
	}
}
