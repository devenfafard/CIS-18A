
public class MoveLeftCommand implements Command
{
	Location currentLocation;
	public MoveLeftCommand(Location loc)
	{
		this.currentLocation = loc;
	}
	
	public void execute()
	{
		currentLocation.moveLeft();
	}
	
	public void undo()
	{
		currentLocation.moveRight();
	}
}

