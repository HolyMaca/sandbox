package skyWars;

import javax.swing.ImageIcon;

public interface EnemyShips {
	
	public ImageIcon getImg();
	
	public void receiveUpdates(Sky theSky);
	
	public void destroyEnemyShip();
	
	public void enterSky(Sky theSky);
	
	public int getRowNumber();
	
	public int getSquareNumber();
}
