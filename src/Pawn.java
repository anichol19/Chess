import java.util.ArrayList;

public class Pawn extends Piece {
	public Pawn( int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}
	public ArrayList<Move> findValidMoves(Board board){
		ArrayList<Move> vm = new ArrayList<Move>();
		int x = this.getX();
		int y = this.getY();
		if( this.isWhite() ) {
			if(board.getBoard()[x][y + 1] == null) {
				vm.add(new Move(x, y, x, y + 1 , false));
			}
		}
	}
}
