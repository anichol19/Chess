public class Game {

	public static void main(String[] args)
	{
		System.out.println("Marvel Chess Game");
		//Prompt user for name and PvP/PvCPU
		Game g = new Game();
		Player p1 = new Player("Carter", true);
		Player p2 = new Player("Opponent", false);
		Board b = new Board();
		
		while (!g.isOver(b))
		{
			
		}
	}
	
	public boolean isOver(Board b)
	{
		return true;
	}

}
