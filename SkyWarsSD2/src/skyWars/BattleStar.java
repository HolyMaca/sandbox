package skyWars;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class BattleStar implements EnemyShips, Fly, Observer, EnterSky {
	
	private int rowNumber;
	private int squareNumber;
	private ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("battlestar.png"));
	
	public BattleStar() {
		
	}

	public void fly(Sky theSky) {

		ArrayList<Square> squareToMove = NeighbouringSquares.neighbours(rowNumber, squareNumber);
		
		destroyEnemyShip(theSky);
		
		Random rand = new Random();
		
		Square randomSquare = squareToMove.get(rand.nextInt(squareToMove.size()));
		randomSquare.addBattleShip(this);
	}

	public void enterSky(Sky theSky) {
		for(Row tempRow : Sky.theSky) {
			for( Square tempSquare : tempRow.theRows) {
				if(tempRow.getRowNumber() == 1 && tempSquare.getSquareNumber() == 1){
					tempSquare.addBattleShip(this);
					break;
				}
			}
		}
	}
	
	public void destroyEnemyShip(Sky theSky) {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.getTheEnemyShips().contains(this)){
					tempSquare.getTheEnemyShips().remove(this);
				}
			}
		}
	}
	
	public int getRowNumber() {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.getTheEnemyShips().contains(this)) {
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
				if(tempSquare.getTheEnemyShips().contains(this)) {
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

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
	
	public void destroyEnemyShip() {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				if(tempSquare.getTheEnemyShips().contains(this)){
					tempSquare.getTheEnemyShips().remove(this);
				}
			}
		}
		
	}

	@Override
	public void receiveUpdate(Sky theSky) {
		this.fly(theSky);
		
	}

	@Override
	public void receiveUpdates(Sky theSky) {
		this.fly(theSky);
	}

}
