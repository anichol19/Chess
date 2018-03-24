import java.util.ArrayList;

public class Game {
	public static void showMoves( ArrayList<Move> m ) {
		char[][] moves = new char[8][8];
		for( int i = 0 ; i < 8 ; i++ ) {
			for( int j = 0 ; j < 8 ; j++ ) {
				moves[i][j] = ' ';
			}
		}
		moves[m.get(0).currR()][m.get(0).currC()] = 'S';
		for( int i = 0 ; i < m.size(); i++ ) {
			moves[m.get(i).newR()][m.get(i).newC()] = 'F';
		}
		for( int i = 0 ; i < 8 ; i++ ) {
			for( int j = 0 ; j < 8 ; j++ ) {
				System.out.print("[" + moves[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void main(String[] args)
	{
		System.out.println("Marvel Chess Game");
		//Prompt user for name and PvP/PvCPU
		Game g = new Game();
		Player p1 = new Player("Carter", true);
		Player p2 = new Player("Opponent", false);
		Board b = new Board();
		/*
		 * TESTING ROOK LOGIC AND UPDATESTATE
		Piece[][] checkCheck = b.getBoard();
		checkCheck[6][0] = null;
		b = new Board(checkCheck);
		b.displayBoard();
		System.out.print("\n\n\n");
		ArrayList<Move> rookCornerNoPawn = checkCheck[7][0].findValidMoves(b);
		b.updateState(rookCornerNoPawn.get(5));
		b.displayBoard();
		ArrayList<Move> middlePawn = checkCheck[6][1].findValidMoves(b);
		*/
		//while (!g.isOver(b))
		
		
		/*	TEST KNIGHT INITIAL MOVES
		Piece[][] starter = b.getBoard();
		b.displayBoard();
		ArrayList<Move> knightyknight = starter[7][1].findValidMoves(b);
		*/
		Move m = new Move( 6, 3, 4, 3, false);
		b.updateState(m);
		b.displayBoard();
		ArrayList<Move> bishAfterPawnMove = b.getBoard()[7][2].findValidMoves(b);
		showMoves(bishAfterPawnMove);
		ArrayList<Move> qAfterPawnMove = b.getBoard()[7][3].findValidMoves(b);
		showMoves(qAfterPawnMove);
		Move m2 = new Move( 6, 4, 4, 4, false);
		b.updateState(m2);
		b.displayBoard();
		ArrayList<Move> qAfter2Pawns = b.getBoard()[7][3].findValidMoves(b);
		showMoves(qAfter2Pawns);
		
		{
			
		}
	}

}
