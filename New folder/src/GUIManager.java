import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIManager implements ActionListener
{
	final static int windowHeight = 600;
	final static int windowWidth = 800;
	
	JFrame frame = new JFrame("CIS 18B Midterm");
	JPanel grid = new JPanel();
	
	JButton endTurn = new JButton("end turn");
	JButton undo = new JButton("undo");
	JButton blank = new JButton(" ");
			
	void initGUI()
	{
		//Setting up the grid
		grid.setLayout(new GridLayout(4,3));
		endTurn.addActionListener(this);
		undo.addActionListener(this);
		
		grid.add(undo);
		grid.add(blank);
		grid.add(endTurn);
		
		//fill the grid
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				JButton emp = new JButton("_");
				emp.addActionListener(this);
				grid.add(emp);
			}
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(windowWidth, windowHeight);
		frame.add(grid);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		JButton btn = (JButton) e.getSource();
		if (btn.getText() == null)
		{
			btn.setText("_");
		}
		
		switch (btn.getText())
		{
			case "undo":
				GameManager.getInstance().undo();
				break;
			case "end turn":
				GameManager.getInstance().getCurrentPlayer().endTurn();
				break;
			case "_":
				btn.setText(GameManager.getInstance().move(btn));
				break;
			default:
				break;
		}
	}
}