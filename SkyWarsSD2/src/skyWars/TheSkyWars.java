package skyWars;

public class TheSkyWars {
	
	static int skySize = 4;
	Sky theSky;
	MasterShip Ms;
	int shipsCanDestroy;
	EnemyShips foe;
	
	public TheSkyWars() {
		Sky theSky = new Sky(skySize);
		Ms = new MasterShip();
		shipsCanDestroy = Ms.BattleMode();
		Ms.enterSky(theSky);
	}
	
	public boolean moveButton() {
		
		Ms.fly(theSky);
		boolean youLose = Ms.conflict(theSky, shipsCanDestroy);
		return youLose;
	}
	
	public int getShipsCanDestroy() {
		return this.shipsCanDestroy;
	}

	public void setShipsCanDestroy(int shipsCanDestroy) {
		this.shipsCanDestroy = shipsCanDestroy;
	}

}
