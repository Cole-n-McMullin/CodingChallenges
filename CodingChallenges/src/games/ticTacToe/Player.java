package games.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char c;

	public Move getMove(Grid g){
		Move m = new Move();
		while (true){
			System.out.println("Make a move, enter an X value. ");
			while (true){
				int s = new Integer (readLine());
				if(s==1 || s==2 || s==3){
					m.x = s;
					break;
				}
				else{
					System.out.println("Try entering a number between 1 and 3 this time.");
					continue;
				}
			}
			System.out.println("Make a move, enter a Y value. ");
			while (true){
				int s = new Integer (readLine());
				if(s==1 || s==2 || s==3){
					m.y = s;
					break;
				}
				else{
					System.out.println("Try entering a number between 1 and 3 this time.");
					continue;
				}
			}
			if (!g.occupied(m.x, m.y)) { 
				break; 
			}
			else{
				System.out.println("That spot is taken. Please try again.");
			}
		}
		return m;
	}

	private String readLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
