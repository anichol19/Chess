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
		checkCheck[6][0] = null;
		b = new Board(checkCheck);
		ArrayList<Move> rookCornerNoPawn = checkCheck[7][0].findValidMoves(b);
		
		ArrayList<Move> middlePawn = checkCheck[6][1].findValidMoves(b);
		//while (!g.isOver(b))
		{
			
		}
	}

}
