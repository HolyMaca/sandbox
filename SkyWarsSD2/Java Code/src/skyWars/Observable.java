package skyWars;

public interface Observable {
	
	public void registerObserver(EnemyShips e);
	public void removeObserver(EnemyShips e);
	public void updateObservers(Sky theSky);

}
