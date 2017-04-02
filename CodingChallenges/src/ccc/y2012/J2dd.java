package ccc.y2012;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2dd {

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
	static int a;
	static int b;
	static int c;
	static int d;
	static int nikky;
	static int bryon;
	static int steps;
	static int nSteps;
	static int bSteps;
	static boolean nForward = true;
	static int     nStepCount = 0;
	static boolean bForward = true;
	static int     bStepCount = 0;

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
		for (int i=0; i< steps; i++) {
			nikkyStep();
			bryonStep();
		}
	}

	static void nikkyStep() {
		// What should happen here?

		while (true){
			if (nForward == true && nSteps <= a){
				nikky++;
				nStepCount++;
				nSteps++;
				}

			if (nForward == false && nSteps <= b){
				nikky--;
				nStepCount++;
				nSteps++;
				if(nSteps == b){
					nSteps = 0;
					nForward = true;
				}
			}
			if(nSteps == a){
				nSteps = 0;
				nForward = false;
			}
			//System.out.println(nStepCount + " " + nikky);
			break;
		}
	}

	static void bryonStep() {

		while (true){
			if (bForward == true && bSteps <= c){
				bryon++;
				bStepCount++;
				bSteps++;
			}

			if (bForward == false && bSteps <= d){
				bryon--;
				bStepCount++;
				bSteps++;
				if(bSteps == d){
					bSteps = 0;
					bForward = true;
				}
			}
			if(bSteps == c){
				bSteps = 0;
				bForward = false;
			}
			//System.out.println(bStepCount + " " + bryon);
			break;
		}
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
