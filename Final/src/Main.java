
public class Main 
{
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args)
	{
		GameManager gameManager = new GameManager().getInstance();
		
		GUIManager board = new GUIManager();
		
		gameManager.initGame();
	}
}
