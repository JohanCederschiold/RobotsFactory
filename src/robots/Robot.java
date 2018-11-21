package robots;

public class Robot {

	private String type;
	private String color;
	private String greeting;
	private static int serialNo = 1000; //startnummer för serien
	

	public Robot(String type, String color, String greeting) {
		this.type = type;
		setColor(color);
		this.greeting = greeting;
		serialNo++;
	}


	public String getType() {
		return type;
	}


	public String getColor() {
		return color;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setColor(String color) {
		if (!color.equalsIgnoreCase("black")) {
			this.color = color;
		} else {
			this.color = "Black";
		}
		
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String toString () {
		return "good";
	}
	
	
	
	
	
	
	
	
	
}
