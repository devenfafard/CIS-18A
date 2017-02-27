package Assignment2.src;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame
{	
	public static void main(String[] args)
	{	
		Subject subData = new SubscriberData();
		
		JFrame window = new JFrame("National Geographic Subscriber Manager");
		JPanel contentPane = new JPanel(new FlowLayout());
		JButton add = new JButton("Add New Subscriber");
		JButton remove = new JButton("Remove Existing Subscriber");
		JButton notify = new JButton("Notify Subscribers");
		
		final int WINDOW_HEIGHT = 600;
		final int WINDOW_LENGTH = 800;
		
		add.addActionListener(new AddListener(subData));
		remove.addActionListener(new RemoveListener(subData));
		// TODO notify setup
		
		contentPane.setAlignmentX(FlowLayout.CENTER);
		contentPane.add(window, add);
		contentPane.add(window, remove);
		contentPane.add(window, notify);
		
		window.setContentPane(contentPane);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
	}
}

class AddListener implements ActionListener
{
	Subject subData = null;
	public AddListener(Subject _subData)
	{
		this.subData = _subData;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String _address = JOptionPane.showInputDialog(null, "Enter the address for a new subscriber:");
		@SuppressWarnings("unused")
		Subscriber sub = new Subscriber(subData, _address);
	}
}

class RemoveListener implements ActionListener
{
	Subject subData = null;
	public RemoveListener(Subject _subData)
	{
		this.subData = _subData;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String _address = JOptionPane.showInputDialog(null, "Enter the address of the subscriber you wish to remove:");
		Observer _obs = (Observer)((SubscriberData) subData).findObserver(_address);
		subData.removeObserver(_obs);			
	}
}

class NotifyListener implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}