import java.util.Stack;
public class MovementInvoker
{
	Stack previousCommands = new Stack();
	Command previousCommand = null;
	
	public void move(Command com)
	{
		com.execute();
		previousCommands.push(com);
	}
	
	public void undoMovement()
	{
		((Command) previousCommands.lastElement()).undo();
		previousCommands.pop();
	}
}
