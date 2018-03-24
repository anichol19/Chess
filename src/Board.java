
public class Board {
	private Piece[][] board;
	
	public Board() {
		
		int i, j;
		board = new Piece[8][8];
		
		for (i = 0; i < board.length; i++)
		{
			for (j = 0; j < board[0].length; j++)
			{
				if (i == 1)
					board[i][j] = new Pawn(i, j, false);
				if (i == 6)
					board[i][j] = new Pawn(i, j, true);
				if (i == 0)
				{
					if (j == 0 || j == 7)
						board[i][j] = new Rook(i, j, false);
					if (j == 1 || j == 6)
						board[i][j] = new Knight(i, j, false);
					if (j == 2 || j == 5)
						board[i][j] = new Bishop(i, j, false);
					if (j == 3)
						board[i][j] = new Queen(i, j, false);
					if (j == 4)
						board[i][j] = new King(i, j, false);
				}
				if (i == 7)
				{
					if (j == 0 || j == 7)
						board[i][j] = new Rook(i, j, true);
					if (j == 1 || j == 6)
						board[i][j] = new Knight(i, j, true);
					if (j == 2 || j == 5)
						board[i][j] = new Bishop(i, j, true);
					if (j == 3)
						board[i][j] = new Queen(i, j, true);
					if (j == 4)
						board[i][j] = new King(i, j, true);
				}
			}
		}
	}
	
	public void displayBoard(Board b)
	{
		int i, j;
		for (i = 0; i < 8; i++)
		{
			for (j = 0; j < 8; j++)
			{
				System.out.println(board[i][j]);
			}
		}
	}
	
	public Piece[][] getBoard() {
		return board;
	}
	
}
