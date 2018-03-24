
public class Board {
	private Piece[][] board = new Piece[8][8];
	
	public Board() {
		
		int i, j;
		for (i = 0; i < board.length; i++)
		{
			for (j = 0; j < board[0].length; j++)
			{
				if (i == 1)
					board[i][j] = new Pawn(i, j, false);
				else if (i == 6)
					board[i][j] = new Pawn(i, j, true);	
				else
					board[i][j] = null;
			}
		}
	}
	
	public Piece[][] getBoard() {
		return board;
	}
	
}
