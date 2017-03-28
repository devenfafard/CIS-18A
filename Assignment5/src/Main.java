import javax.swing.*;

public class Main 
{
	public static void main (String[] args)
	{
		Location currentLocation = new Location();
		MovementInvoker moveController = new MovementInvoker();
		MoveLeftCommand xNegCommand = new MoveLeftCommand(currentLocation);
		MoveRightCommand xPosCommand = new MoveRightCommand(currentLocation);
		MoveUpCommand yPosCommand = new MoveUpCommand(currentLocation);
		MoveDownCommand yNegCommand = new MoveDownCommand(currentLocation);
		
		int choice = -1;
		String menuText = "<0> : quit\n" +
						  "<1> : move left     " + "<2> : move right\n" + 
						  "<3> : move up      "  + "<4> : move down\n"  +
						  "<5> : undo last movement " ;
		
		while (choice != -1)
		{
			String location = "(" + currentLocation.getX() + "," + currentLocation.getY() + ")";
			JOptionPane.showMessageDialog(null, "You are now at " + location);
			String input = JOptionPane.showInputDialog(null, menuText);
			choice = Integer.parseInt(input);
			
			switch (choice)
			{
				case 0: choice = -1; break;
				case 1:	 moveController.move(xNegCommand);
					break;
				case 2: moveController.move(xPosCommand);
					break;
				case 3: moveController.move(yPosCommand);
					break;
				case 4: moveController.move(yNegCommand);
					break;
				case 5: moveController.undoMovement(); break;
				default: JOptionPane.showMessageDialog(null, "Please enter valid input!");
					break;
			}		
		}
	}
}