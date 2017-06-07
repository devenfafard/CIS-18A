import javax.swing.*;
public class GUIManager implements Observer
{
	
	public GUIManager()
	{
		GameManager gm = new GameManager().getInstance();
		gm.addObserver(this);
	}
	//Update GUI
	public void notify(String output) 
	{
		JOptionPane.showMessageDialog(null, output);
	}
}