public class MoveDownCommand implements Command
{
	Location currentLocation;
	public MoveDownCommand(Location loc)
	{
		this.currentLocation = loc;
	}
	
	public void execute()
	{
		currentLocation.moveDown();
		
	}
	
	public void undo()
	{
		currentLocation.moveUp();
	}
}