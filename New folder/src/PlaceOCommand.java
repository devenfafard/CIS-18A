
public class PlaceOCommand implements Command
{
	TileCreator tileCreator = null;
	String text = null;
	
	public PlaceOCommand(TileCreator tc)
	{
		tileCreator = tc;
	}
	
	public String execute() 
	{
		if (tileCreator != null)
		{
			text = tileCreator.createTile("o");
		}
		else 
		{
			System.out.println("TILE CREATOR NOT FOUND!");
		}
		
		return text;
	}
}