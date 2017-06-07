public class WhiteDecorator
{
	Piece piece = null;
	
	public WhiteDecorator(Piece p)
	{
		this.piece = p;
	}
	
	public String getPiece()
	{
		return "w" + piece.getPiece();
	}
}