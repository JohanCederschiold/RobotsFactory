package robots;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		RobotFactory factory = new RobotFactory("Excessive inc", "Without us the world will burn");
		factory.produceForStock(100);
		
		
		Robot no1 = new Robot ("Slayer", "Green", "Hi");
		Robot no2 = new Robot ("Butcher", "Blue", "Dave?");
		
		RobotArena arena = new RobotArena(no1, no2);
		
		arena.robotFight();
		
		System.out.printf("The winner is %s", arena.getWinner());
	}

}
