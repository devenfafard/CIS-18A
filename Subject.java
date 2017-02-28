package Assignment2.src;

public interface Subject 
{
	public void registerObserver(Observer _obs);
	public void removeObserver(Observer _obs);
	public void notifyObservers(String _message);
	public Observer findObserver(String address);
}
