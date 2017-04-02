package adventofcode.y2016;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Day1 {
	private Scanner br = new Scanner(System.in);
	public static void main(String[] args) {
		Day1 o = new Day1();
		o.run();
	}
	
	public void run() {
		readInput();
		solve();
		printSolution();
	}
	private String readLine() {
			return br.nextLine();
	}
	//***********************************************
	// Define some variables
	//***********************************************
	String s;
	int counter = 0;
	
	private void readInput() {
		
		int total = 0;
		while (true) {
			s = readLine();
			
			if (s.trim().length() == 0) { break; }
		
			total += wrapping(s);
		}
		System.out.println(total);
	}
	
	
	private void solve() {
		
	}
	
	
	private void printSolution() {
		
	}
	
	private int wrapping(String s) {
		
		String [] strings = s.split("x");
		
		List<Integer> ints = new ArrayList<Integer>(3);
		
		for (String a: strings) {
			ints.add(Integer.valueOf(a));
		}
		
		Collections.sort(ints);
		int x = ints.get(0);
		int y = ints.get(1);
		int z = ints.get(2);
		return  x+x+y+y + (x*y*z);
	}
}
