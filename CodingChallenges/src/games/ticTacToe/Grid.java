package games.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grid {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char [][] xo = new char[3][3];

	public void clear() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				xo[i][j] = ' ';
			}
		}
	}

	public char getWinner() {
		for(int i = 0;i<3; i++){
			if(xo[0][i]!=' ' && xo[0][i]==xo[1][i] && xo[0][i]==xo[2][i]){
				return xo[0][i];
			}
		}
		for(int i = 0;i<3; i++){
			if(xo[i][0]!=' ' && xo[i][0]==xo[i][1] && xo[i][0]==xo[i][2]){
				return xo[i][0];
			}
		}
		if(xo[0][0]!=' ' && xo[0][0] == xo[1][1] && xo[0][0] == xo[2][2]){
			return xo[0][0];
		}
		if(xo[2][0]!=' ' && xo[2][0] == xo[1][1] && xo[2][0] == xo[0][2]){
			return xo[2][0];
		}
		else{
			return ' ';
		}
	}

	public void move(int x, int y, char z) {
	
		if(occupied(x, y) == false){
			xo[x-1][y-1]=z;
		}
		System.out.println(toString());
	}

	public boolean occupied (int x, int y) {
		if(xo[x-1][y-1] == 'X' ||xo[x-1][y-1] == 'O'){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){
		String s;
		s =     " " + xo[0][0] +" | "+ xo[1][0]+" | "+ xo[2][0] +" \n";
		s = s + "---+---+---\n";
		s = s + " " + xo[0][1] +" | "+ xo[1][1]+" | "+ xo[2][1] +" \n";
		s = s + "---+---+---\n";
		s = s + " " + xo[0][2] +" | "+ xo[1][2]+" | "+ xo[2][2] +" \n";
		return s;
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
