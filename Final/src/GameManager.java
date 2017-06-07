import java.util.ArrayList;
public class GameManager implements Subject
{
	private static GameManager instance = null;
	private ArrayList<Observer> observers;
	String gridSpaces[] = new String[64];
	
	/*Singleton implementation.*/ 
	public GameManager() { }
	public static GameManager getInstance()
	{
		if (instance == null)
			instance = new GameManager();
		
		return instance;
	}
	
	void initGame()
	{
		/*Creating the pieces.*/
		King king = new King();
		Queen queen = new Queen();
		Bishop bishop = new Bishop();
		Knight knight = new Knight();
		Castle castle = new Castle();
		Pawn pawn = new Pawn();

		/*Converting pieces to strings.*/
		String wKi = new WhiteDecorator(king).getPiece();
		String bKi = new BlackDecorator(king).getPiece();
		String wQ = new WhiteDecorator(queen).getPiece();
		String bQ = new BlackDecorator(queen).getPiece();
		String wB = new WhiteDecorator(bishop).getPiece();
		String bB = new BlackDecorator(bishop).getPiece();
		String wK = new WhiteDecorator(knight).getPiece();
		String bK = new BlackDecorator(knight).getPiece();
		String wC = new WhiteDecorator(castle).getPiece();
		String bC = new BlackDecorator(castle).getPiece();
		String wP = new WhiteDecorator(pawn).getPiece();
		String bP = new BlackDecorator(pawn).getPiece();
		
		/*Adding white pieces to the board.*/
		gridSpaces[0] = wC;
		gridSpaces[1] = wK;
		gridSpaces[2] = wB;
		gridSpaces[3] = wKi;
		gridSpaces[4] = wQ;
		gridSpaces[5] = wB;
		gridSpaces[6] = wK;
		gridSpaces[7] = wC;
		for (int i = 8; i < 16; i++)
		{
			gridSpaces[i] = wP;
		}
		
		/*Adding all of the empty spaces to the board.*/
		for (int i = 16; i < 47; i++)
		{
			if (i % 2 == 0)
				gridSpaces[i] = " # ";
			else
				gridSpaces[i] = "   ";
		}
		
		/*Adding black pieces to the board.*/
		for (int i = 48; i < 56; i++)
		{
			gridSpaces[i] = bP;
		}
		gridSpaces[56] = bC;
		gridSpaces[57] = bK;
		gridSpaces[58] = bB;
		gridSpaces[59] = bKi;
		gridSpaces[60] = bQ;
		gridSpaces[61] = bB;
		gridSpaces[62] = bK;
		gridSpaces[63] = bC;
		
		notifyObservers();
	}
	
	public void notifyObservers() 
	{
		//String line0 = " A  B  C  D  E  F  G  H  ";
		String output = null;
		for (int i = 0; i < 64; i++)
		{
			if (i % 8 == 0)
				output += "\n" + gridSpaces[i];
			else
				output += gridSpaces[i];
		}
		
		for(Observer obs : observers)
		{
			obs.notify(output);
		}
		
	}

	public void addObserver(Observer obs) 
	{
		observers.add(obs);
	}
	
	public void removerObserver(Observer obs) 
	{
		observers.remove(obs);
	}
}