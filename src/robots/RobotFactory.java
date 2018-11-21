package robots;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RobotFactory {
	
	private String brand;
	private String slogan;
	private String [] standardTypes = {"Maintenance", "Waiter", "Bodyguard"};
	private int [] artNo = {123, 124, 125};
	private String [] colors = {"Yellow", "Black", "Blue"};
	private List<Robot> stocks;
	private Random random = new Random(); //slumpmässig production av robotar
	
	
	public RobotFactory(String brand, String slogan) {
		this.brand = brand;
		this.slogan = slogan;
		stocks = new ArrayList<>();
	}
	
	
	public Robot produceBespokeRobot (String type, String color, String greeting) {
		return new Robot(type, color, greeting);
	}
	
	public void produceForStock (int quantity) {
		
			
		for (int i = 0 ; i < quantity ; i++ ) {
			
			int robotNo = random.nextInt(standardTypes.length);
			String setGreeting = String.format("Hi, I am a %s-robot from %s with articlenumber %d. Pleased to meet you", 
					standardTypes[robotNo], brand, artNo[robotNo]);
				
			stocks.add(new Robot(standardTypes[robotNo], colors[robotNo], setGreeting));
			
			
		}
		
	}
	
	public void letRobotsOnStockSayHi () {
		for (Robot robot : stocks) {
			System.out.println(robot.getGreeting());
		}
	}


	public String getBrand() {
		return brand;
	}


	public String getSlogan() {
		return slogan;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
	
	
	

}
