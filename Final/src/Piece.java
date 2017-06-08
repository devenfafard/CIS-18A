public class Piece
{
	String name = "";
	boolean isCaptured = false;
	boolean isWhite = true;
	
	public Piece(String color)
	{
		if (color == "white")
		{
			isWhite = true;
			name = "|  |";
		}
		else
		{
			isWhite = false;
			name = "|##|";
		}
	}

	public Piece getPiece()
	{
		return this;
	}
	
	public String getName()
	{
		if (isWhite)
			return "|w" + this.name;
		else
			return "|b" + this.name;
	}
	
	void capture()
	{
		isCaptured = true;
	}
}