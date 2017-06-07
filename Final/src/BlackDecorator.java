public class BlackDecorator
{
	Piece piece = null;
	
	public BlackDecorator(Piece p)
	{
		this.piece = p;
	}
	
	public String getPiece()
	{
		return "b" + piece.getPiece();
	}
}