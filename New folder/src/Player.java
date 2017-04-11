
public class Player
{
	GameManager observer = null;
	String name = null;
	
	public Player(String _name, GameManager _manager)
	{
		name = _name;
		observer = _manager;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void endTurn()
	{
		observer.update();
	}
}