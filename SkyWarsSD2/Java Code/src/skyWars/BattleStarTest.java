package skyWars;

import junit.framework.TestCase;

public class BattleStarTest extends TestCase {

	public void testReceiveUpdate() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		EnemyShips testShip = new BattleStar();
		
		testShip.enterSky(testSky);
		
		int previousRow = testShip.getRowNumber();
		int previouSquare = testShip.getSquareNumber();
		
		testShip.receiveUpdates(testSky);
		
		int newRow = testShip.getRowNumber();
		int newSquare = testShip.getSquareNumber();
		
		assertTrue(previousRow != newRow || previouSquare != newSquare);
	}

	public void testFly() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		BattleStar testShip = new BattleStar();
		
		testShip.enterSky(testSky);
		int previousRow = testShip.getRowNumber();
		int previousSquare = testShip.getSquareNumber();
		
		testShip.fly(testSky);
		int newRow = testShip.getRowNumber();
		int newSquare = testShip.getSquareNumber();
		
		boolean row = newRow >=0 && newRow <= Sky.NUMBER_OF_ROWS && (newRow != previousRow || newSquare != previousSquare);
		boolean rowExpected = true;
		
		boolean square = newSquare >=0 && newSquare <= Sky.NUMBER_OF_ROWS && (newRow != previousRow || newSquare != previousSquare);
		boolean squareExpected = true;
		
		assertTrue(row == rowExpected && square == squareExpected);
	}

	public void testEnterSky() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		EnemyShips testShip = new BattleStar();
		
		testShip.enterSky(testSky);
		
		int row = testShip.getRowNumber();
		int square = testShip.getSquareNumber();
		
		int rowExpected = 1;
		int squareExpected = 1;
		
		assertTrue( row == rowExpected && square == squareExpected);
	}

	public void testDestroyEnemyShip() {
		int size = Sky.NUMBER_OF_ROWS;
		Sky testSky = new Sky(size);
		EnemyShips testShip = new BattleStar();
		
		testShip.enterSky(testSky);
		testShip.destroyEnemyShip();
		
		boolean actual = Sky.theSky.contains(testShip);
		boolean expected = false;
		
		assertTrue(actual == expected);
		
	}

}
