public abstract class Piece
{
	String name = "piece";
	boolean isCaptured = false;
	boolean isWhite = true;

	public Piece getPiece()
	{
		return this;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	void capture()
	{
		isCaptured = true;
	}
	
	void setColor(boolean color)
	{
		isWhite = color;
	}
}