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
		
		final int WINDOW_HEIGHT = 110;
		final int WINDOW_LENGTH = 500;
		
		add.addActionListener(new AddListener(subData));
		remove.addActionListener(new RemoveListener(subData));
		notify.addActionListener(new NotifyListener(subData));
		
		contentPane.setAlignmentX(FlowLayout.CENTER);
		contentPane.add(add);
		contentPane.add(remove);
		contentPane.add(notify);
		
		window.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
		window.setLocationRelativeTo(null);
		window.setContentPane(contentPane);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		String address = JOptionPane.showInputDialog(null, "Enter the address for a new subscriber:");
		Subscriber sub = new Subscriber(subData, address);
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
		String address = JOptionPane.showInputDialog(null, "Enter the address of the subscriber you wish to remove:");
		Observer obs = subData.findObserver(address);
		subData.removeObserver(obs);			
	}
}

class NotifyListener implements ActionListener
{
	Subject subData = null;
	public NotifyListener(Subject _subData)
	{
		this.subData = _subData;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String message = JOptionPane.showInputDialog(null, "Enter notification message:");
		subData.notifyObservers(message);
	}
}