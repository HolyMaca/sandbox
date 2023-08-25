package skyWars;

import java.util.Random;

public class SpawnEnemyShips {
	
	public EnemyShips spawnEnemyShip() {
		
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(3);
		int chance = randomGenerator.nextInt(3);
		
		if(chance == 1){
			if(random == 1){
				return new BattleCruiser();
			}
			
			if(random == 2){
				return new BattleStar();
			}else {
			return new BattleShooter();
			}
		}else{
			return null;
		}
		
	}

}
