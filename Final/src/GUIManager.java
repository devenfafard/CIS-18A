import javax.swing.*;
public class GUIManager implements Observer
{
	GameManager sub = null;
	
	public GUIManager()
	{
		sub = new GameManager().getInstance();
		sub.addObserver(this);
	}
	
	//Update board
	public void notify(String output) 
	{
		JOptionPane.showMessageDialog(null, output);
	}
}