package Assignment2.src;

public interface Subject 
{
	public void registerObserver(Observer _obs);
	public void removeObserver(Observer _obs);
	public void notifyObservers(Observer _obs);
}
