
public class PlaceXCommand implements Command
{
	TileCreator tileCreator = null;
	String text = null;
	
	public PlaceXCommand(TileCreator tc)
	{
		tileCreator = tc;
	}
	
	public String execute() 
	{
		
		if (tileCreator != null)
		{
			text = tileCreator.createTile("x");
		}
		else 
		{
			System.out.println("TILE CREATOR NOT FOUND!");
		}
		
		return text;
	}
}