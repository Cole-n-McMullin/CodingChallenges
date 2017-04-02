package games.ticTacToe;


public class CPU {

	public Move getMove(Grid g){

		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 3; j++){
				if(!g.occupied(j,i)){
					if (isWinner(g , j , i) == true) {
						return new Move(j,i);
					}
				}
				else{
					continue;
				}
			}
		}
		if(!g.occupied(2, 2)){
			return new Move(2,2);
		}
		if(!g.occupied(1, 1)){
			return new Move(1,1);
		}
		if(!g.occupied(1, 3)){
			return new Move(1,3);
		}
		if(!g.occupied(2, 1)){
			return new Move(1,1);
		}
		if(!g.occupied(1, 2)){
			return new Move(1,2);
		}
		return new Move(3,3);
	}
	private boolean isWinner(Grid g, int j, int i){
		g.xo[j-1][i-1] = 'X';
		if (g.getWinner() != ' '){
			g.xo[j-1][i-1] = ' ';
			return true;
		}
		g.xo[j-1][i-1] = 'O';
		if (g.getWinner() != ' '){
			g.xo[j-1][i-1] = ' ';
			return true;
		}
		else{
			g.xo[j-1][i-1] = ' ';
			return false;
		}
	}
}
