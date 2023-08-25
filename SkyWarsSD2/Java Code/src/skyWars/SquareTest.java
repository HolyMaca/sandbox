package skyWars;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

	public void testAddBattleShip() {
		int size = 1;
		Square testSquare = new Square(size);
		EnemyShips testEnemy = new BattleStar();
		
		testSquare.addBattleShip(testEnemy);
		
		boolean actual = testSquare.getTheEnemyShips().contains(testEnemy);
		boolean expected = true;
		
		assertTrue(actual == expected);
	}

	public void testDestroyEnemy() {
		int size = 1;
		Square testSquare = new Square(size);
		EnemyShips testEnemy = new BattleStar();
		
		testSquare.addBattleShip(testEnemy);
		testSquare.destroyEnemy(testEnemy);
		
		boolean actual = testSquare.getTheEnemyShips().contains(testEnemy);
		boolean expected = false;
		
		assertTrue(actual == expected);
	}

	public void testAddMasterShip() {
		int size = 1;
		Square testSquare = new Square(size);
		MasterShip testMasterShip = new MasterShip();
		
		testSquare.addMasterShip(testMasterShip);
		
		MasterShip actual = testSquare.getTheMasterShip();
		MasterShip expected = testMasterShip;
		
		assertTrue(actual == expected);
	}

	public void testDestroyMasteShip() {
		int size = 1;
		Square testSquare = new Square(size);
		MasterShip testMasterShip = new MasterShip();
		
		testSquare.addMasterShip(testMasterShip);
		testSquare.destroyMasteShip(testMasterShip);
		
		boolean actual = testSquare.isMsInTheSquare();
		boolean expected = false;
		
		assertTrue(actual == expected);
	}

	public void testDestroyEnemies() {
		int size = 1;
		Square testSquare = new Square(size);
		EnemyShips testBattleStar = new BattleStar();
		EnemyShips testBattleCruiser = new BattleCruiser();
		
		testSquare.addBattleShip(testBattleCruiser);
		testSquare.addBattleShip(testBattleStar);
		testSquare.destroyEnemies();
		
		int actual = 0;
		int expected = testSquare.getTheEnemyShips().size();
		
		assertTrue(actual == expected);
	}

}
