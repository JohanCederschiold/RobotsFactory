package robots;

import java.util.Random;

public class RobotArena {
	
	private Robot one;
	private Robot two;
	private Random random = new Random();
	
	
	
	public RobotArena (Robot robotOne, Robot robotTwo) {
		
		one = robotOne;
		two = robotTwo;
		
	}
	
	public Robot robotFight () {
		
		while (one.getHealthpoint() > 0 && two.getHealthpoint() > 0) {
			one.setHealthpoints(one.getHealthpoint() - random.nextInt(20));
			two.setHealthpoints(two.getHealthpoint() - random.nextInt(20));
			
			System.out.printf("One has %d healthpoints       Two has %d healthpoints\n", 
					one.getHealthpoint(), two.getHealthpoint());
		}
		
		if (one.getHealthpoint() > two.getHealthpoint()) {
			return one;
		} else if (one.getHealthpoint() == two.getHealthpoint()) {
			return null;
		} else {
			return two;
		}
		
 		
	}

}
