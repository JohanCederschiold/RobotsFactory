package robots;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		RobotFactory factory = new RobotFactory("Excessive inc", "Without us the world will burn");
		factory.produceForStock(100);
		
//		factory.letRobotsOnStockSayHi();
		
		List<Robot> myList = factory.getStocks();
		
		for (Robot robot : myList) {
			System.out.println(robot);
		}

	}

}
