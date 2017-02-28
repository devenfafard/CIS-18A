package Assignment2.src;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SubscriberData implements Subject
{
	private List<Observer> subscribers = new ArrayList<Observer>();
	
	public Observer findObserver(String _address)
	{
		for (Observer subscriber : subscribers)
		{
			if (subscriber.getAddress().equals(_address))
			{
				return subscriber;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No subscriber found at that address!");
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

	public void notifyObservers(String _message) 
	{
		if (subscribers.size() > 0)
		{
			for (Observer obs : subscribers)
			{
				obs.update(_message);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "There are no subscribers!");
		}
	}
}
