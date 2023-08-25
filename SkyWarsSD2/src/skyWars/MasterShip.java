package skyWars;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class MasterShip implements Observable, EnterSky, Fly {
	
	private int rowNumber;
	private int squareNumber;
	protected MasterShipMode BattleMode;
	private ArrayList<EnemyShips> enemiesToUpdate = new ArrayList<EnemyShips>();
	private ImageIcon msIcon = new ImageIcon(getClass().getClassLoader().getResource("mastership.png"));
	
	public MasterShip() {
		setBattleMode(new Defensive());
	}
	
	public void enterSky(Sky theSky) {
		Random random = new Random();
		int rowNumber = random.nextInt(Sky.NUMBER_OF_ROWS);
		int squareNumber = random.nextInt(Row.SIZE_OF_ROW);
		for(Row tempRow : Sky.theSky) {
			for(Square squareNum : tempRow.theRows){
				if(squareNum.getSquareNumber() == squareNumber && tempRow.getRowNumber() == rowNumber) {
					squareNum.addMasterShip(new MasterShip());
					break;
				}
			}
		}
		
	}
	
	public void registerObserver(EnemyShips e) {
		this.enemiesToUpdate.add(e);
		
	}
	
	public void removeObserver(EnemyShips e) {
		this.enemiesToUpdate.remove(e);
		
	}
	
	public void updateObservers(Sky theSky) {
		for(EnemyShips e : this.enemiesToUpdate) {
			e.receiveUpdates(theSky);
		}
		
	}
	
	public void MasterShipMoved(Sky theSky) {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				tempSquare.destroyMasteShip(this);
			}
		}
	}

	public void fly(Sky theSky) {
		
		ArrayList<Square> squareToMove = NeighbouringSquares.neighbours(rowNumber, squareNumber);
		
		MasterShipMoved(theSky);
		
		Random rand = new Random();
		
		Square randomSquare = squareToMove.get(rand.nextInt(squareToMove.size()));
		randomSquare.addMasterShip(this);
		
		this.updateObservers(theSky);
	}
	
	public boolean conflict(Sky theSky, int shipsCanDestroy) {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.isMsInTheSquare()) {
					if(tempSquare.getTheEnemyShips().size() <= shipsCanDestroy && tempSquare.getTheEnemyShips().size() > 0) {
						for(EnemyShips es : tempSquare.getTheEnemyShips()){
							this.removeObserver(es);
						}
						tempSquare.destroyEnemies();
						return false;
					}
					else if(tempSquare.getTheEnemyShips().size() > shipsCanDestroy) {
					}
					return true;
				}
			}
		}
		return false;
	}
	
	public int BattleMode() {
		return this.BattleMode.mode();
	}

	public int getRowNumber() {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.getTheMasterShip() == this) {
					rowNumber = tempRow.getRowNumber();
					break;
				}
			}
		}
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public int getSquareNumber() {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.getTheMasterShip() == this) {
					squareNumber = tempSquare.getSquareNumber();
					break;
				}
			}
		}
		return squareNumber;
	}

	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	}

	public ArrayList<EnemyShips> getEnemiesToUpdate() {
		return enemiesToUpdate;
	}

	public void setEnemiesToUpdate(ArrayList<EnemyShips> enemiesToUpdate) {
		this.enemiesToUpdate = enemiesToUpdate;
	}

	public ImageIcon getMsIcon() {
		return msIcon;
	}

	public void setMsIcon(ImageIcon msIcon) {
		this.msIcon = msIcon;
	}

	public MasterShipMode getBattleMode() {
		return BattleMode;
	}

	public void setBattleMode(MasterShipMode battleMode) {
		BattleMode = battleMode;
	}

}
