public class BlackDecorator extends ColorDecorator
{
	Piece piece = null;
	
	public BlackDecorator(Piece p)
	{
		this.piece = p;
		piece.setColor(false);
	}
	
	public String getFullName()
	{
		return "w" + piece.getName();
	}
}