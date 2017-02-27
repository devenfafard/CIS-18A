package Assignment2.src;
public class Subscriber implements Observer
{	
	private Subject subscriberData = null;
	private String address = null;
	private String message = null;
	boolean recievedMessage = false;
		
	public Subscriber(Subject _subscriberData, String _address)
	{
		this.subscriberData = _subscriberData;
		this.address = _address;
		recievedMessage = false;
		subscriberData.registerObserver(this);
	}
	
	public void update(String _message) 
	{
		this.message = _message;
		recievedMessage = true;		
	}
	
	public String getAddress()
	{
		return this.address;
	}
}
	
