package games.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Game {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		Game o = new Game();
		o.run();
	}
	public void run() {
		printGrid();

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

	public void printGrid() {

		Grid grid = new Grid();
		grid.clear();
		Player p = new Player();
		CPU ai = new CPU();
		int counter = 0;
		long players = 3;
		
		while(players > 2){
			System.out.println("How many players are there?");
			players = new Integer(readLine());
		}		if(players == 0){
			while(grid.getWinner() == ' '|| counter <= 9){

				Move m = ai.getMove(grid);
				grid.move(m.x, m.y, 'O');
				counter++;

				if(counter == 9){
					System.out.println("The game is a tie.");
					return;
				}
				else if(grid.getWinner() != ' '){
					System.out.println(grid.getWinner() + " wins.");
					return;
				}

				m = ai.getMove(grid);
				grid.move(m.x, m.y, 'X');
				counter++;
			}
		}
		else if(players == 2){
			while(grid.getWinner() == ' '|| counter <= 9){

				Move m = p.getMove(grid);
				grid.move(m.x, m.y, 'O');
				counter++;

				if(counter == 9){
					System.out.println("The game is a tie.");
					return;
				}
				else if(grid.getWinner() != ' '){
					System.out.println(grid.getWinner() + " wins.");
					return;
				}

				m = p.getMove(grid);
				grid.move(m.x, m.y, 'X');
				counter++;
			}
		}
		else{
			System.out.println("Do you want to be X or O? Please imput your anwser as one upper-case letter. (O goes first) ");
			String s = readLine();
			char[] xOro = new char[s.length()];
			xOro = s.toCharArray();

			if(xOro[0] == 'O'){
				while(grid.getWinner() == ' '|| counter <= 9){

					Move m = p.getMove(grid);
					grid.move(m.x, m.y, 'O');
					counter++;

					if(counter == 9){
						System.out.println("The game is a tie.");
						return;
					}
					else if(grid.getWinner() != ' '){
						System.out.println(grid.getWinner() + " wins.");
						return;
					}

					m = ai.getMove(grid);
					grid.move(m.x, m.y, 'X');
					counter++;
				}
			}
			else{
				while(grid.getWinner() == ' '|| counter <= 9){

					Move m = ai.getMove(grid);
					grid.move(m.x, m.y, 'O');
					counter++;

					if(counter == 9){
						System.out.println("The game is a tie.");
						return;
					}
					else if(grid.getWinner() != ' '){
						System.out.println(grid.getWinner() + " wins.");
						return;
					}

					m = p.getMove(grid);
					grid.move(m.x, m.y, 'X');
					counter++;
				}
			}
		}
	}
}

