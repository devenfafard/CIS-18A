import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GameManager 
{
	//Singleton Implementation
	private volatile static GameManager instance = null;	
	private GameManager()
	{
		instance = this;
	}
	public static GameManager getInstance()
	{
		if (instance == null)
		{
			synchronized(GameManager.class)
			{
				if (instance == null)
				{
					instance = new GameManager();
				}
			}
		}
		
		return instance;
	}
	
	// Class Variables
	TurnInvoker turnInvoker = new TurnInvoker();
	TileCreator tileCreator = new TileCreator();
	PlaceXCommand xCom = new PlaceXCommand(tileCreator);
	PlaceOCommand oCom = new PlaceOCommand(tileCreator);
	GUIManager guiManager = new GUIManager();
	Player player1, player2 = null;
	Player currentPlayer = null;

	//Class Functions
	void startGame()
	{
		String playerName = null;
		guiManager.initGUI();
		
		playerName = JOptionPane.showInputDialog(null, "Enter a name for player 1:");
		player1 = new Player(playerName, this);
		playerName = JOptionPane.showInputDialog(null, "Enter a name for player 2:");
		player2 = new Player(playerName, this);
		
		currentPlayer = player1;
	}
	
	String move(JButton src)
	{
		String text = null;
		if (currentPlayer == player1)
		{
			text = turnInvoker.move(xCom, src);
		}
		else
		{
			text = turnInvoker.move(oCom, src);
		}
		
		return text;
	}
	
	void undo()
	{
		turnInvoker.undoMovement();
	}
	
	void update()
	{
		if (currentPlayer == player1)
		{
			currentPlayer = player2;
			JOptionPane.showMessageDialog(null, "It's " + currentPlayer.getName() + " turn!");
		}
		else if (currentPlayer == player2)
		{
			currentPlayer = player1;
			JOptionPane.showMessageDialog(null, "It's " + currentPlayer.getName() + " turn!");
		}				
	}
	
	Player getCurrentPlayer()
	{
		return currentPlayer;
	}
}
