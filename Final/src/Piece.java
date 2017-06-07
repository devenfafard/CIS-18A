public abstract class Piece
{
	String piece = "piece";
	boolean isCaptured = false;

	public String getPiece()
	{
		return piece;
	}
	
	void capture()
	{
		isCaptured = true;
	}
}