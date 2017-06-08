public class WhiteDecorator extends ColorDecorator
{
	Piece piece = null;
	
	public WhiteDecorator(Piece p)
	{
		this.piece = p;
		piece.isWhite = true;
	}
	
	public String getFullName()
	{
		return "w" + piece.getPiece();
	}
}