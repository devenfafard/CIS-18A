
public class TileCreator 
{
	public String createTile(String type)
	{
		String text = null;
		
		switch (type)
		{
			case "x":
			{
				text = "X";
				break;
			}
			case "o":
			{
				text = "O";
				break;
			}
			default:
				break;
		}
		
		return text;
	}
}