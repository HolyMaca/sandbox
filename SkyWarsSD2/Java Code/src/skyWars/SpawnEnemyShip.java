package skyWars;

import java.util.Random;

public class SpawnEnemyShip {
	
	public EnemyShips spawnEnemy() {
		
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(3);
		int chance = randomGenerator.nextInt(3);
		
		if(chance == 1){
			if(random == 1){
				return new BattleShooter();
			}
			
			if(random == 2){
				return new BattleStar();
			}else {
			return new BattleCruiser();
			}
		}else{
			return null;
		}
		
	}

}
