
public class Main 
{
	public static void main(String[] args)
	{
		GameManager gameManager = new GameManager().getInstance();
		Board board = new Board();
		
		gameManager.initGame();
	}
}
