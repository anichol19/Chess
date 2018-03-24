import java.util.ArrayList;

public class Pawn extends Piece {
	
	public Pawn( int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}
	public ArrayList<Move> findValidMoves(Board board){
		ArrayList<Move> vm = new ArrayList<Move>();
		int x = this.getX();
		int y = this.getY();
		Piece[][] cb = board.getBoard();
		//White moving "Up"
		if( this.isWhite() ) {
			//forward movements
			if( (y - 1 >= 0 ) && cb[x][y - 1] == null) {
				vm.add(new Move(x, y, x, y - 1 , false));
				//Double move if it hasn't moved
				if( !this.hasMoved() && (y - 2 >= 0) && cb[x][y - 2] == null) {
					vm.add( new Move(x, y, x, y - 2, false));
				}
			}
			//Right capture
			if( (x + 1 < 8) && (y - 1 >= 0) && cb[x+1][y-1] != null ) {
				vm.add( new Move(x, y, x+1, y-1, true));
			}
			//Left capture
			if( (x - 1 >= 0) && (y - 1 >= 0) && cb[x-1][y-1] != null ) {
				vm.add( new Move(x, y, x-1, y-1, true));
			}
		}
		//Black, moving "Down"
		else {
			//forward movements
			if( (y + 1 < 8 ) && cb[x][y + 1] == null) {
				vm.add(new Move(x, y, x, y + 1 , false));
				//Double move if it hasn't moved
				if( !this.hasMoved() && (y + 2  < 8 ) && cb[x][y + 2] == null) {
					vm.add( new Move(x, y, x, y - 2, false));
				}
			}
			//Right capture
			if( (x + 1 < 8) && (y + 1 < 8) && cb[x+1][y+1] != null ) {
				vm.add( new Move(x, y, x+1, y+1, true));
			}
			//Left capture
			if( (x - 1 >= 0) && (y + 1 < 8) && cb[x-1][y+1] != null ) {
				vm.add( new Move(x, y, x-1, y+1, true));
			}
		}
		return vm;
	}
}
