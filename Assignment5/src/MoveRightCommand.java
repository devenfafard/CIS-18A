
public class MoveRightCommand implements Command
{
	Location currentLocation;
	public MoveRightCommand(Location loc)
	{
		this.currentLocation = loc;
	}
	
	public void execute()
	{
		currentLocation.moveRight();
	}
	
	public void undo()
	{
		currentLocation.moveLeft();
	}
}
