
public interface Subject
{
	public void addObserver(Observer obs);
	public void removerObserver(Observer obs);
	public void notifyObservers();
}
