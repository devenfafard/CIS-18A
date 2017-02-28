package Assignment2.src;

import javax.swing.JOptionPane;
public class Subscriber implements Observer
{	
	private Subject subscriberData = null;
	private String address = null;
	private String message = null;
		
	public Subscriber(Subject _subscriberData, String _address)
	{
		this.subscriberData = _subscriberData;
		this.address = _address;
		subscriberData.registerObserver(this);
	}
	
	public void update(String _message) 
	{
		this.message = _message;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String getAddress()
	{
		return this.address;
	}
}
