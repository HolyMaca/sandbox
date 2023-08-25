package skyWars;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Square {
	private int squareNumber;
	private ArrayList<EnemyShips> theEnemyShips =new ArrayList <EnemyShips> ();
	private MasterShip theMasterShip;
	private boolean MsInTheSquare;
	private boolean EnemyInTheSquare;
	private ImageIcon squareIcon = new ImageIcon(getClass().getClassLoader().getResource("space.png"));
	
	public Square(int squareNumber) {
		setSquareNumber(squareNumber);
		setMsInTheSquare(false);
		setEnemyInTheSquare(false);
	}
	
	public void addBattleShip(EnemyShips es) {
		this.theEnemyShips.add(es);
		setEnemyInTheSquare(true);
	}
	
	public void destroyEnemy(EnemyShips es) {
		theEnemyShips.remove(es);
		setEnemyInTheSquare(false);
	}
	
	public void addMasterShip(MasterShip ms) {
		this.theMasterShip = ms;
		setMsInTheSquare(true);
	}
	
	public void destroyMasteShip(MasterShip ms) {
		this.theMasterShip = null;
		setMsInTheSquare(false);
	}
	
	public void destroyEnemies() {
		this.theEnemyShips.removeAll(theEnemyShips);
	}
	
	public ImageIcon squareImg() {
		ImageIcon output = this.squareIcon;
		if(this.theMasterShip != null) {
			output = this.theMasterShip.getMsIcon();
		}
		else if (this.theEnemyShips.size() > 0) {
			for (EnemyShips e : this.theEnemyShips) {
				output = e.getImg();
			}
			
		}
		return output;
	}
	
	
//Getters & Setters
	public int getSquareNumber() {
		return squareNumber;
	}

	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	}

	public ArrayList<EnemyShips> getTheEnemyShips() {
		return theEnemyShips;
	}

	public void setTheEnemyShips(ArrayList<EnemyShips> theEnemyShips) {
		this.theEnemyShips = theEnemyShips;
	}

	public MasterShip getTheMasterShip() {
		return theMasterShip;
	}

	public void setTheMasterShip(MasterShip theMasterShip) {
		this.theMasterShip = theMasterShip;
	}

	public boolean isMsInTheSquare() {
		return MsInTheSquare;
	}

	public void setMsInTheSquare(boolean msInTheSquare) {
		MsInTheSquare = msInTheSquare;
	}

	public boolean isEnemyInTheSquare() {
		return EnemyInTheSquare;
	}

	public void setEnemyInTheSquare(boolean enemyInTheSquare) {
		EnemyInTheSquare = enemyInTheSquare;
	}

	public ImageIcon getSquareIcon() {
		return squareIcon;
	}

	public void setSquareIcon(ImageIcon squareIcon) {
		this.squareIcon = squareIcon;
	}

}
