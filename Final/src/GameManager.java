import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GameManager implements Subject
{
	private static GameManager instance = null;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	String gridSpaces[] = new String[64];
	Piece gridPieces[] = new Piece[64];
	
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
		
		King king = new King();
		Queen queen = new Queen();
		Bishop bishop = new Bishop();
		Knight knight = new Knight();
		Castle castle = new Castle();
		Pawn pawn = new Pawn();

		/*Converting pieces to strings.*/
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
		String bP = new BlackDecorator(pawn).getFullName();
		
		/*Adding white pieces to the board.*/
		gridSpaces[0] = " " + wC;
		gridSpaces[1] = " " + wK;
		gridSpaces[2] = " " + wB;
		gridSpaces[3] = wKi;
		gridSpaces[4] = " " + wQ;
		gridSpaces[5] = " " + wB;
		gridSpaces[6] = " " + wK;
		gridSpaces[7] = " " + wC;
		for (int i = 8; i < 16; i++)
		{
			gridSpaces[i] = " " + wP;
		}
		
		/*Adding all of the empty spaces to the board.*/
		for (int i = 16; i < 47; i++)
		{
			if (i % 2 == 0)
				gridSpaces[i] = "  #  ";
			else
				gridSpaces[i] = "  _  ";
		}
		
		/*Adding black pieces to the board.*/
		for (int i = 48; i < 56; i++)
		{
			gridSpaces[i] = " " + bP;
		}
		gridSpaces[56] = " " + bC;
		gridSpaces[57] = " " + bK;
		gridSpaces[58] = " " + bB;
		gridSpaces[59] = bKi;
		gridSpaces[60] = " " + bQ;
		gridSpaces[61] = " " + bB;
		gridSpaces[62] = " " + bK;
		gridSpaces[63] = " " + bC;
		
		//////////Config Piece array//////////
		gridPieces[0].
		
		notifyObservers();
	}
	
	public void turn()
	{
		String piece = JOptionPane.showInputDialog("Which piece would you like to move?");
		for (int i = 0; i < 64; i++)
		{
			if (piece == gridSpaces[i])
			{
				//if (gridSpaces[i].is)
			}
		}
	}
	
	public void notifyObservers() 
	{
		String line0 = " A  B  C  D  E  F  G  H  ";
		String output = "";
		for (int i = 0; i < 64; i++)
		{
			if (i % 8 == 0)
				output += "\n" + gridSpaces[i];
			else
				output += " " + gridSpaces[i] + " ";
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