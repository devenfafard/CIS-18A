
public class MovementInvoker
{
	Location currentLocation = new Location();
	MoveLeftCommand xNegCommand = new MoveLeftCommand(currentLocation);
	MoveRightCommand xPosCommand = new MoveRightCommand(currentLocation);
	MoveUpCommand yPosCommand = new MoveUpCommand(currentLocation);
	MoveDownCommand yNegCommand = new MoveDownCommand(currentLocation);
	
	public void undoMovement()
	{
		
	}
}
