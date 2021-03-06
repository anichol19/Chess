
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
					board[i][j] = new Pawn(i, j, false, "");
				if (i == 6)
					board[i][j] = new Pawn(i, j, true, "");
				if (i == 0)
				{
					if (j == 0 || j == 7)
						board[i][j] = new Rook(i, j, false, "");
					if (j == 1 || j == 6)
						board[i][j] = new Knight(i, j, false, "");
					if (j == 2 || j == 5)
						board[i][j] = new Bishop(i, j, false, "");
					if (j == 3)
						board[i][j] = new Queen(i, j, false, "");
					if (j == 4)
						board[i][j] = new King(i, j, false, "");
				}
				if (i == 7)
				{
					if (j == 0 || j == 7)
						board[i][j] = new Rook(i, j, true, "");
					if (j == 1 || j == 6)
						board[i][j] = new Knight(i, j, true, "");
					if (j == 2 || j == 5)
						board[i][j] = new Bishop(i, j, true, "");
					if (j == 3)
						board[i][j] = new Queen(i, j, true, "");
					if (j == 4)
						board[i][j] = new King(i, j, true, "");
				}
			}
		}
	}
	
	public Board(Piece[][] b) {
		board = b;
	}
	public void displayBoard()
	{
		int i, j;
		for (i = 0; i < 8; i++)
		{
			for (j = 0; j < 8; j++)
			{
				if(board[i][j] == null) {
					System.out.print("    ");
				}
				else {
					String color = "";
					if(board[i][j].isWhite()) {
						color = "W";
					}
					else {
						color = "B";
					}
					System.out.print(board[i][j] + color + "  " );
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public Piece[][] getBoard() {
		return board;
	}
	
	public Board updateState(Move m) {
		if( !m.wasCapture() ) {
			//play sound?
			//Move old piece to "graveyard"
		}
		board[m.newR()][m.newC()] = board[m.currR()][m.currC()];
		board[m.newR()][m.newC()].setCol(m.newC());
		board[m.newR()][m.newC()].setRow(m.newR());
		board[m.currR()][m.currC()] = null;
		return this;
	}
	
}
