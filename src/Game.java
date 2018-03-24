import java.util.ArrayList;

public class Game {

	public static void main(String[] args)
	{
		System.out.println("Marvel Chess Game");
		//Prompt user for name and PvP/PvCPU
		Game g = new Game();
		Player p1 = new Player("Carter", true);
		Player p2 = new Player("Opponent", false);
		Board b = new Board();
		Piece[][] checkCheck = b.getBoard();
		checkCheck[2][2] = new Pawn(2,2,true);
		ArrayList<Move> middlePawn = checkCheck[6][1].findValidMoves(b);
		//while (!g.isOver(b))
		{
			
		}
	}

}
