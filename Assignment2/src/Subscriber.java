import java.util.Observable;
import java.util.Observer;
public class Subscriber implements Observer
{	//pg 70-74
	String address = null;
	String message = null;
	boolean recievedMessage = false;
	Observable data = null;
	
	public Subscriber()
	{
		
	}
	
	public Subscriber (String _address, Observable _data)
	{
		this.address = _address;
		this.data = _data;
		data.addObserver(this);
	}

	public void update(Observable _data, String _message) 
	{
		if (_data instanceof SubscriberData) 
		{
			SubscriberData subData = (SubscriberData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
}
