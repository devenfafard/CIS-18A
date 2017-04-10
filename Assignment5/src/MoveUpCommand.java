public class MoveUpCommand implements Command
{
	Location currentLocation;
	public MoveUpCommand(Location loc)
	{
		this.currentLocation = loc;
	}
	
	public void execute()
	{
		currentLocation.moveUp();
	}
	
	public void undo()
	{
		currentLocation.moveDown();
	}
}