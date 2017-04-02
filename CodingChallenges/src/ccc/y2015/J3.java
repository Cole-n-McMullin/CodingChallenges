package ccc.y2015;


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
	static String  input;
	static String  output;
	
	public static void readInput() {
		// Put some code here.
			input =(readLine());
			
	}

	public static void solvePuzzle() {
		// Put some code here.
		output = "";
		char[] letters = input.toCharArray();
		for (int i=0; i<letters.length; i++){
			char letter = letters [i];
			
			switch (letter) {
				case 'a':  output = output + "a";    break; 
				case 'b':  output = output + "bac";  break; 
				case 'c':  output = output + "cad";  break; 
				case 'd':  output = output + "def";  break; 
				case 'e':  output = output + "e";  	 break; 
				case 'f':  output = output + "feg";  break; 
				case 'g':  output = output + "geh";  break; 
				case 'h':  output = output + "hij";  break; 
				case 'i':  output = output + "i";  	 break; 
				case 'j':  output = output + "jik";  break; 
				case 'k':  output = output + "kil";  break; 
				case 'l':  output = output + "lim";  break; 
				case 'm':  output = output + "mon";  break; 
				case 'n':  output = output + "nop";  break; 
				case 'o':  output = output + "o";  	 break; 
				case 'p':  output = output + "poq";  break; 
				case 'q':  output = output + "qor";  break; 
				case 'r':  output = output + "ros";  break; 
				case 's':  output = output + "sut";  break; 
				case 't':  output = output + "tuv";  break; 
				case 'u':  output = output + "u";    break; 
				case 'v':  output = output + "vuw";  break; 
				case 'w':  output = output + "wux";  break; 
				case 'x':  output = output + "xuy";  break; 
				case 'y':  output = output + "yuz";  break; 
				case 'z':  output = output + "zuz";  break; 
			}
		}
	}

	public static void printOutput() {
		// Put some code here.
		System.out.println(output);
	}

	//***********************************************************************


}
