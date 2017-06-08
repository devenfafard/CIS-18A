import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GameManager implements Subject
{
	private static GameManager instance = null;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	Piece gridSpaces[] = new Piece[64];
	
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
		/*
		King wKing  = new King();
		wKing.setColor(true);
		King bKing = new King();
		bKing.setColor(false);
		
		Queen wQueen = new Queen();
		wQueen.setColor(true);
		Queen bQueen = new Queen();
		bQueen.setColor(false);
		
		Bishop wBishop = new Bishop();
		wBishop.setColor(true);
		Bishop bBishop = new Bishop();
		bBishop.setColor(false);*/
		
		King wKing = new King("white");
		King bKing  = new King("black");
		
		Queen wQueen = new Queen("white");
		Queen bQueen = new Queen("black");
		
		Bishop wBishop = new Bishop("white");
		Bishop bBishop = new Bishop("black");
		
		Knight wKnight = new Knight("white");
		Knight bKnight = new Knight("black");
		
		Castle wCastle = new Castle("white");
		Castle bCastle = new Castle("black");
		
		Pawn wPawn = new Pawn("white");
		Pawn bPawn = new Pawn("black");
		

		/*Converting pieces to strings.
		String wKi = new WhiteDecorator(king).getFullName();
		String bKi = new BlackDecorator(king).getFullName();
		String wQ = new WhiteDecorator(queen).getFullName();
		String bQ = new BlackDecorator(queen).getFullName();
		String wB = new WhiteDecorator(bishop).getFullName();
		String bB = new BlackDecorator(bishop).getFullName();
		String wK = new WhiteDecorator(knight).getFullName();
		String bK = new BlackDecorator(knight).getFullName();
		String wC = new WhiteDecorator(castle).getFullName();
		String bC = new BlackDecorator(castle).getFullName();
		String wP = new WhiteDecorator(pawn).getFullName();
		String bP = new BlackDecorator(pawn).getFullName();*/
		
		/*Adding white pieces to the board.*/
		gridSpaces[0] = bCastle;
		gridSpaces[1] = bKnight;
		gridSpaces[2] = bBishop;
		gridSpaces[3] = bKing;
		gridSpaces[4] = bQueen;
		gridSpaces[5] = bBishop;
		gridSpaces[6] = bKnight;
		gridSpaces[7] = bCastle;
		for (int i = 8; i < 16; i++)
		{
			gridSpaces[i] = bPawn;
		}
		
		/*Adding all of the empty spaces to the board.*/
		for (int i = 16; i < 47; i+= 2)
		{
			gridSpaces[i] = new Empty("white");
		}
		for (int i = 16; i < 47; i+=1)
		{
			gridSpaces[i] = new Empty("black");
		}
		
		/*Adding black pieces to the board.*/
		for (int i = 48; i < 56; i++)
		{
			gridSpaces[i] = wPawn;
		}
		gridSpaces[56] = wCastle;
		gridSpaces[57] = wKnight;
		gridSpaces[58] = wBishop;
		gridSpaces[59] = wKing;
		gridSpaces[60] = wQueen;
		gridSpaces[61] = wBishop;
		gridSpaces[62] = wKnight;
		gridSpaces[63] = wCastle;
		
		notifyObservers();
	}
	
	public void turn()
	{
		String piece = JOptionPane.showInputDialog("Which piece would you like to move?");
		for (int i = 0; i < 64; i++)
		{
			/*if (piece == gridSpaces[i])
			{
				//if (gridSpaces[i].is)
			}*/
		}
	}
	
	public void notifyObservers() 
	{
		String line0 = " A  B  C  D  E  F  G  H  ";
		String output = "";
		for (int i = 0; i < 64; i++)
		{
			if (i % 8 == 0)
				output += "\n" + gridSpaces[i].getName();
			else
				output += gridSpaces[i].getName();
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