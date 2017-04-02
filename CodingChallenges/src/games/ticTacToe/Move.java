package games.ticTacToe;

public class Move {
	int x;
	int y;
	
	public Move() { }

	public Move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
