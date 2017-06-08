import javax.swing.*;
public class Board implements Observer
{
	GameManager sub = null;
	
	public Board()
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