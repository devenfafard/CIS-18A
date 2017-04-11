import java.util.Stack;
import javax.swing.JButton;

public class TurnInvoker 
{
	Stack<JButton> previousCommands = new Stack<JButton>();
	String text = null;
	
	public String move(Command com, JButton src)
	{
		text = com.execute();
		previousCommands.push(src);
		return text;
	}
	
	public void undoMovement()
	{
		if (!previousCommands.isEmpty())
		{
			previousCommands.lastElement().setText("_");
		}
	}
}