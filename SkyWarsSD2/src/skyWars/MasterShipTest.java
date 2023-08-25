package skyWars;

import junit.framework.TestCase;

public class MasterShipTest extends TestCase {

	public void testEnterSky() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		MasterShip testMasterShip = new MasterShip();
		
		testMasterShip.enterSky(testSky);
		
		int row = testMasterShip.getRowNumber();
		int square = testMasterShip.getSquareNumber();
		
		assertTrue( row >= 0 && square >= 0 && row <= Sky.NUMBER_OF_ROWS && square <= Sky.NUMBER_OF_ROWS);
		
	}

	public void testRegisterObserver() {
		MasterShip testMasterShip = new MasterShip();
		EnemyShips testBattleStar = new BattleStar();
		
		testMasterShip.registerObserver(testBattleStar);
		
		boolean actual = testMasterShip.getEnemiesToUpdate().contains(testBattleStar);
		boolean expected = true;
		
		assertTrue(actual == expected);
	}

	public void testRemoveObserver() {
		MasterShip testMasterShip = new MasterShip();
		EnemyShips testBattleStar = new BattleStar();
		
		testMasterShip.registerObserver(testBattleStar);
		testMasterShip.removeObserver(testBattleStar);
		
		boolean actual = testMasterShip.getEnemiesToUpdate().contains(testBattleStar);
		boolean expected = false;
		
		assertTrue(actual == expected);
	}

	public void testUpdateObservers() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		MasterShip testMasterShip = new MasterShip();
		EnemyShips testBattleStar = new BattleStar();
		
		testMasterShip.registerObserver(testBattleStar);
		testBattleStar.enterSky(testSky);
		testMasterShip.updateObservers(testSky);
		
		int row = testBattleStar.getRowNumber();
		int square = testBattleStar.getSquareNumber();
		
		int numberExpected = 1;
		
		assertTrue(row == numberExpected && square == numberExpected);
	}

	public void testFly() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		MasterShip testMasterShip = new MasterShip();
		
		testMasterShip.enterSky(testSky);
		int previousRow = testMasterShip.getRowNumber();
		int previousSquare = testMasterShip.getSquareNumber();
		
		testMasterShip.fly(testSky);
		int newRow = testMasterShip.getRowNumber();
		int newSquare = testMasterShip.getSquareNumber();
		
		boolean row = newRow >=0 && newRow <= Sky.NUMBER_OF_ROWS && (newRow != previousRow || newSquare != previousSquare);
		boolean rowExpected = true;
		
		boolean square = newSquare >=0 && newSquare <= Sky.NUMBER_OF_ROWS && (newRow != previousRow || newSquare != previousSquare);
		boolean squareExpected = true;
		
		assertTrue(row == rowExpected && square == squareExpected);
		
	}

	public void testConflict() {
		
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		MasterShip testMasterShip = new MasterShip();
		EnemyShips testBattleStar = new BattleStar();
		EnemyShips testBattleCruiser = new BattleCruiser();
		
		testMasterShip.registerObserver(testBattleStar);
		testMasterShip.registerObserver(testBattleCruiser);
		testMasterShip.enterSky(testSky);
		testBattleStar.enterSky(testSky);
		testBattleCruiser.enterSky(testSky);
		
		boolean actual = testMasterShip.conflict(testSky, 1);
		boolean expected = true;
		
		assertTrue(actual == expected);
		
		
		
	}

	public void testBattleMode() {
		MasterShip testMasterShip = new MasterShip();
		int actual = testMasterShip.BattleMode();
		int expected = 1;
		
		assertTrue(actual == expected);
	}

}
