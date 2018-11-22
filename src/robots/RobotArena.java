package robots;

import java.util.Random;

public class RobotArena implements Runnable  {
	
	public Thread activity = new Thread(this);
	private Robot one;
	private Robot two;
	private Robot winner;
	private int originalHpOne;
	private int originalHpTwo;
	private Random random = new Random();
	
	
	
	public RobotArena (Robot robotOne, Robot robotTwo) {
		
		one = robotOne;
		two = robotTwo;
		
		originalHpOne = one.getHealthpoint();
		originalHpTwo = two.getHealthpoint();
		
	}
	
	public void robotFight () {
		
		while (one.getHealthpoint() > 0 && two.getHealthpoint() > 0) {
			
			try {
				Thread.sleep(random.nextInt(7) * 1000);
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}
			
			one.setHealthpoints(one.getHealthpoint() - random.nextInt(20));
			two.setHealthpoints(two.getHealthpoint() - random.nextInt(20));
			
			System.out.printf("One has %d healthpoints       Two has %d healthpoints\n", 
					one.getHealthpoint(), two.getHealthpoint());
		}
		
		if (one.getHealthpoint() > two.getHealthpoint()) {
			winner = one;
		} else if (one.getHealthpoint() == two.getHealthpoint()) {
			one.setHealthpoints(originalHpOne);
			two.setHealthpoints(originalHpTwo);
			robotFight();
		} else {
			winner = two;
		}
		
 		
	}
	public Robot getWinner () {
		return winner;
		
	}

	@Override
	public void run() {
		
		robotFight();
		
	}

}
