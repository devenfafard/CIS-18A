
public class Location 
{
	int x;
	int y;
	
	public Location()
	{
		x = 0;
		y = 0;
	}
	
	public void moveLeft() 	{ x--; }
	public void moveRight() { x++; }
	public void moveUp() 	{ y++; }
	public void moveDown() 	{ y--; }
}
