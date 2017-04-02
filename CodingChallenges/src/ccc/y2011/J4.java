package ccc.y2011;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class J4 {

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
	static int	mine[][] = new int[401][200];
	static int xPos = 0;
	static int yPos = -1;
	static final int X0 = 200;
	static final int Y0 = -1;
	static List<String> inputlist = new ArrayList<String>(100);
	
	public static void readInput() {
		// Put some code here.
		while(true){
			String s = (readLine());
			inputlist.add(s);
			char direction = s.charAt(0);
			if(direction == 'q'){
				return;
			}
		}
	}

	public static void solvePuzzle() {
		// Put some code here.
		dig (xPos, yPos);
		down(2);
		right(3);
		down(2);
		right(2);
		up(2);
		right(2);
		down(4);
		left(8);
		up(2);
		while(true){
			String s = inputlist.remove(0);
			boolean safe = true;
			char direction = s.charAt(0);
			int length = new Integer(s.substring(2));
			if(direction == 'd'){
				safe = down(length);
			}
			if(direction == 'l'){
				safe = left(length);
			}
			if(direction == 'r'){
				safe = right(length);
			}
			if(direction == 'u'){
				safe = up(length);
			}
			if(direction == 'q'){
				return;
			}
			if (safe){
				System.out.println(xPos + " " + yPos + " safe");
			}
			else{
				System.out.println(xPos + " " + yPos + " DANGER");
				return;
			}
		}
	}

	public static void dig(int x, int y) {
		//System.out.println("Digging (" + xPos + " " + yPos + ")");
		mine[x+X0][-y-1] = 1;
	}

	public static boolean isDug(int x, int y) {
		if (mine[x+X0][-y-1] == 1) { return true; }
		return false;
	}

	public static void printOutput() {
		// Put some code here.
		//printMine();	
	}
	public static boolean right(int r) {
		int xNew = xPos + r;
		for (int x=xPos+1; x<=xNew; x++) {
			if (isDug(x, yPos)){
				xPos = xNew;
				return false;
			}
			dig(x, yPos);
		}
		xPos = xNew;
		return true;
	}
	public static boolean left(int l) {
		int xNew = xPos - l;
		for (int x=xPos-1; x>=xNew; x--) {
			if (isDug(x, yPos)){
				xPos = xNew;
				return false;
			}
			dig(x, yPos);
		}
		xPos = xNew;
		return true;
	}
	public static boolean up(int u) {
		int yNew = yPos + u;
		for (int y=yPos+1; y<=yNew; y++) {
			if(isDug(xPos, y)){
				yPos = yNew;
				return false;
			}
			dig(xPos, y);
		}
		yPos = yNew;
		return true;
	}
	
	public static boolean down(int d) {
		int yNew = yPos - d;
		for (int y=yPos-1; y>=yNew; y--) {
			if(isDug(xPos, y)){
				yPos = yNew;
				return false;
			}
			dig(xPos, y);
		}
		yPos = yNew;
		return true;
	}

	public static void printMine(){
		for(int y=0; y<20; y++){
			for( int x=0; x<21; x++){
				System.out.print(mine[x][y] + " ");
			}
			System.out.println();
		}
	}
}
