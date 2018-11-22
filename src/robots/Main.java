package robots;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		RobotFactory factory = new RobotFactory("Excessive inc", "Without us the world will burn");
		factory.produceForStock(100);
		
//		factory.letRobotsOnStockSayHi();
		
//		List<Robot> myList = factory.getStocks();
//		
//		for (Robot robot : myList) {
//			System.out.println(robot);
//		}
		
		
		Robot no1 = new Robot ("Slayer", "Green", "Hi");
		Robot no2 = new Robot ("Butcher", "Blue", "Dave?");
		
		RobotArena arena = new RobotArena(no1, no2);
		
		System.out.println(arena.robotFight());

	}

}
