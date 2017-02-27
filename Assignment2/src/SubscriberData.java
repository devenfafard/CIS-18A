package Assignment2.src;
import java.util.ArrayList;
import java.util.List;

public class SubscriberData implements Subject
{
	private List<Observer> subscribers = new ArrayList<Observer>();
	
	public Observer findObserver(String _address)
	{
		for (Observer subscriber : subscribers)
		{
			if (((Subscriber) subscriber).getAddress() == _address)
			{
				return subscriber;
			}
		}
		
		return null;
	}
	
	public void registerObserver(Observer _obs) 
	{
		subscribers.add(_obs);
		
	}

	public void removeObserver(Observer _obs) 
	{
		subscribers.remove(_obs);
	}

	@Override
	public void notifyObservers(Observer _obs) 
	{
		// TODO Auto-generated method stub
		
	}
}
